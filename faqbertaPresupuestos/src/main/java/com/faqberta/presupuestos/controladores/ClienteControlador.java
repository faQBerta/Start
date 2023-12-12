package com.faqberta.presupuestos.controladores;

import com.faqberta.presupuestos.entidades.Cliente;
import com.faqberta.presupuestos.excepciones.MiException;
import com.faqberta.presupuestos.servicios.ClienteServicio;
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
@RequestMapping("/cliente") //localhost:8080/cliente
public class ClienteControlador {

    @Autowired
    private ClienteServicio clienteServicio;

    @GetMapping("/registrar") //localhost:8080/cliente/registrar
    public String registrar() {
        return "cliente_form.html";
    }

    @PostMapping("/registro") //localhost:8080/cliente/registro
    public String registro(@RequestParam String nombre, ModelMap modelo) {

        try {
            clienteServicio.crearCliente(nombre);

            modelo.put("exito", "El cliente fue cargado correctamente");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());

            return "cliente_form.html";
        }
        return "index.html";
    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {
        List<Cliente> clientes = clienteServicio.listarClientes();

        modelo.addAttribute("clientes", clientes);

        return "cliente_list.html";
    }
    
    @GetMapping("/modificar/{idCliente}")
    public String modificar(@PathVariable String idCliente, ModelMap modelo) {
        modelo.put("cliente", clienteServicio.getOne(idCliente));
        
        return "cliente_modificar.html";
    }
    
    @PostMapping("/modificar/{idCliente}")
    public String modificar(@PathVariable String idCliente, String nombre, ModelMap modelo) {
        try {
            clienteServicio.modificarCliente(idCliente, nombre);
            
            return "redirect:../lista";
            
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "cliente_modificar.html";
        }
    }
    
}
