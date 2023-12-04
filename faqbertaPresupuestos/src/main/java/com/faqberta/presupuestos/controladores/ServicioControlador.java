package com.faqberta.presupuestos.controladores;

import com.faqberta.presupuestos.excepciones.MiException;
import com.faqberta.presupuestos.servicios.ServicioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/servicio") //localhost:8080/servicio
public class ServicioControlador {

    @Autowired
    private ServicioServicio servicioServicio;

    @GetMapping("/registrar") //localhost:8080/servicio/registrar
    public String registrar() {
        return "servicio_form.html";
    }

    @PostMapping("/registro") //localhost:8080/cliente/registro
    public String registro(@RequestParam String nombre, ModelMap modelo) {

        try {
            servicioServicio.crearServicio(nombre);

            modelo.put("exito", "El servicio fue cargado correctamente");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());

            return "servicio_form.html";
        }
        return "index.html";
    }
}
