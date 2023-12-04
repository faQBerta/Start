package com.faqberta.presupuestos.controladores;

import com.faqberta.presupuestos.excepciones.MiException;
import com.faqberta.presupuestos.servicios.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
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
}
