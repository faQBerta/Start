package com.faqberta.presupuestos.controladores;

import com.faqberta.presupuestos.entidades.Usuario;
import com.faqberta.presupuestos.excepciones.MiException;
import com.faqberta.presupuestos.servicios.UsuarioServicio;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public class PortalControlador { //localhost:8080/

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/")
    public String index() { //localhost:8080/

        return "index.html";
    }

    @GetMapping("/login")
    public String login(@RequestParam(required = false) String error, ModelMap modelo) {

        if (error != null) {
            modelo.put("error", "Usuario o contraseña invalidos");
        }

        return "login.html";
    }

    @GetMapping("/registrar")
    public String registrar() {
        return "registro.html";
    }

    @PostMapping("/registro")
    public String registro(MultipartFile archivo, @RequestParam String nombre, @RequestParam String email, @RequestParam String password, @RequestParam String password2, ModelMap modelo) {

        try {
            usuarioServicio.registrar(archivo, nombre, email, password, password2);

            modelo.put("exito", "Usuario registrado correctamente.");

            return "inicio.html";
        } catch (MiException ex) {

            modelo.put("error", ex.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("email", email);

            return "registro.html";
        }
    }

    @PreAuthorize("hasAnyRole ('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/perfil")
    public String perfil(ModelMap modelo, HttpSession session) {

        Usuario usuario = (Usuario) session.getAttribute("usuariosession");
        modelo.put("usuario", usuario);

        return "usuario_modificar.html";
    }

    @PreAuthorize("hasAnyRole ('ROLE_USER', 'ROLE_ADMIN')")
    @PostMapping("/perfil/{id}")
    public String actualizar(MultipartFile archivo, @RequestParam String nombre, @RequestParam String email, @RequestParam String password, @RequestParam String password2, ModelMap modelo) {

        try {
            usuarioServicio.actualizar(archivo, email, nombre, email, password, password2);

            modelo.put("exito", "Usuario actualizado correctamente.");

            return "inicio.html";
        } catch (MiException ex) {

            modelo.put("error", ex.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("email", email);

            return "usuario_modificar.html";
        }

    }

    @PreAuthorize("hasAnyRole ('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/inicio")
    public String inicio(HttpSession session) {

        Usuario logueado = (Usuario) session.getAttribute("usuariosession");

        if (logueado.getRol().toString().equals("ADMIN")) {
            return "redirect:/admin/dashboard";
        }

        return "inicio.html";
    }
}
