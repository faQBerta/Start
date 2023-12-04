package com.faqberta.presupuestos.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PortalControlador { //localhost:8080/
    
    @GetMapping("/")
    public String index () { //localhost:8080/
        
        return "index.html";
    }
    
    
}
