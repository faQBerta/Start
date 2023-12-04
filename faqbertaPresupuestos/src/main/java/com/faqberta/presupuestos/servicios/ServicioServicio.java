package com.faqberta.presupuestos.servicios;

import com.faqberta.presupuestos.entidades.Servicio;
import com.faqberta.presupuestos.excepciones.MiException;
import com.faqberta.presupuestos.repositorios.ServicioRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioServicio {

    @Autowired
    ServicioRepositorio servicioRepositorio;

    @Transactional
    public void crearServicio(String nombre) throws MiException {
        
        validar(nombre, "asd");

        Servicio servicio = new Servicio();

        servicio.setNombre(nombre);

        servicioRepositorio.save(servicio);

    }

    public List<Servicio> listarServicios() {

        List<Servicio> servicios = new ArrayList<>();

        servicios = servicioRepositorio.findAll();

        return servicios;
    }

    public void modificarServicio(String nombre, String id) throws MiException {

        validar(nombre, id);
        
        Optional<Servicio> respuesta = servicioRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Servicio servicio = respuesta.get();

            servicio.setNombre(nombre);

            servicioRepositorio.save(servicio);
        }
    }

        private void validar(String nombre, String id) throws MiException{
        
        if (id.isEmpty() || id == null) {
            throw new MiException("El ID del servicio no puede ser nulo o estar en blanco.");
        }

        if (nombre.isEmpty() || nombre == null) {
            throw new MiException("El nombre del servicio no puede ser nulo o estar en blanco.");
        }

    }
}
