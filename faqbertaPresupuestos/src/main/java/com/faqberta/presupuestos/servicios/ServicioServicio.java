package com.faqberta.presupuestos.servicios;

import com.faqberta.presupuestos.entidas.Servicio;
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
    public void crearServicio(String nombre) {

        Servicio servicio = new Servicio();

        servicio.setNombre(nombre);

        servicioRepositorio.save(servicio);

    }

    public List<Servicio> listarPresupuestos() {

        List<Servicio> servicios = new ArrayList<>();

        servicios = servicioRepositorio.findAll();

        return servicios;
    }

    public void modificarServicio(String nombre, String id) {

        Optional<Servicio> respuesta = servicioRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Servicio servicio = respuesta.get();

            servicio.setNombre(nombre);

            servicioRepositorio.save(servicio);
        }
    }

}
