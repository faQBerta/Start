package com.faqberta.presupuestos.controladores;

import com.faqberta.presupuestos.entidades.Cliente;
import com.faqberta.presupuestos.entidades.Presupuesto;
import com.faqberta.presupuestos.entidades.Servicio;
import com.faqberta.presupuestos.excepciones.MiException;
import com.faqberta.presupuestos.servicios.ClienteServicio;
import com.faqberta.presupuestos.servicios.PresupuestoServicio;
import com.faqberta.presupuestos.servicios.ServicioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/presupuesto")
public class PresupuestoControlador {

    @Autowired
    private PresupuestoServicio presupuestoServicio;
    @Autowired
    private ClienteServicio clienteServicio;
    @Autowired
    private ServicioServicio servicioServicio;

    @GetMapping("/registrar") //localhost:8080/presupuesto/registrar
    public String registrar(ModelMap modelo) {

        List<Cliente> clientes = clienteServicio.listarClientes();
        List<Servicio> servicios = servicioServicio.listarServicios();

        modelo.addAttribute("clientes", clientes);
        modelo.addAttribute("servicios", servicios);

        return "presupuesto_form.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam(required = false) Long idPres, @RequestParam String Nombre, @RequestParam(required = false) Integer Valor, @RequestParam String idCliente, @RequestParam String idServicio, ModelMap modelo) {

        try {
            presupuestoServicio.crearPresupuesto(idPres, Nombre, Valor, idCliente, idServicio); //si todo sale bien retomamos al index

            modelo.put("exito", "El presupuesto fue cargado correctamente");

        } catch (MiException ex) {
            List<Cliente> clientes = clienteServicio.listarClientes();
            List<Servicio> servicios = servicioServicio.listarServicios();

            modelo.addAttribute("clientes", clientes);
            modelo.addAttribute("servicios", servicios);

            modelo.put("error", ex.getMessage());

            return "presupuesto_form.html";
        }
        return "index.html";
    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {

        List<Presupuesto> presupuestos = presupuestoServicio.listarPresupuestos();

        modelo.addAttribute("presupuestos", presupuestos);

        return "presupuesto_list";
    }

    @GetMapping("/modificar/{idPres}")
    public String modificar(@PathVariable Long idPres, ModelMap modelo) {
        modelo.put("presupuesto", presupuestoServicio.getOne(idPres));

        List<Cliente> clientes = clienteServicio.listarClientes();
        List<Servicio> servicios = servicioServicio.listarServicios();

        modelo.addAttribute("clientes", clientes);
        modelo.addAttribute("servicios", servicios);

        return "presupuesto_modificar.html";
    }

    @PostMapping("/modificar/{idPres}")
    public String modificar(@PathVariable Long idPres, String Nombre, Integer Valor, String idCliente, String idServ, ModelMap modelo) {
        try {
            List<Cliente> clientes = clienteServicio.listarClientes();
            List<Servicio> servicios = servicioServicio.listarServicios();

            modelo.addAttribute("clientes", clientes);
            modelo.addAttribute("servicios", servicios);

            presupuestoServicio.modificarPresupuesto(idPres, Nombre, Valor, idCliente, idServ);

            return "redirect:../lista";

        } catch (MiException ex) {
            List<Cliente> clientes = clienteServicio.listarClientes();
            List<Servicio> servicios = servicioServicio.listarServicios();

            modelo.put("error", ex.getMessage());

            modelo.addAttribute("clientes", clientes);
            modelo.addAttribute("servicios", servicios);

            return "presupuesto_modificar.html";
        }
    }
}
