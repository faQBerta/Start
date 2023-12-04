package com.faqberta.presupuestos.servicios;

import com.faqberta.presupuestos.entidades.Cliente;
import com.faqberta.presupuestos.entidades.Presupuesto;
import com.faqberta.presupuestos.entidades.Servicio;
import com.faqberta.presupuestos.excepciones.MiException;
import com.faqberta.presupuestos.repositorios.ClienteRepositorio;
import com.faqberta.presupuestos.repositorios.PresupuestoRepositorio;
import com.faqberta.presupuestos.repositorios.ServicioRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresupuestoServicio {

    @Autowired
    private PresupuestoRepositorio presupuestoRepositorio;
    @Autowired
    private ClienteRepositorio clienteRepositorio;
    @Autowired
    private ServicioRepositorio servicioRepositorio;

    @Transactional //PERMITE UN ROLLBACK EN CASO DE ERROR
    public void crearPresupuesto(Long idPres, String Nombre, Integer Valor, String idCliente, String idServ) throws MiException {
        
        validar(idPres, Nombre, idCliente, idServ, Valor);
        
        Cliente cliente = clienteRepositorio.findById(idCliente).get();
        Servicio servicio = servicioRepositorio.findById(idServ).get();

        Presupuesto presupuesto = new Presupuesto();

        presupuesto.setIdPres(idPres);
        presupuesto.setNombre(Nombre);
        presupuesto.setValor(Valor);
        presupuesto.setReserva(new Date());

        presupuesto.setCliente(cliente);

        presupuesto.setServicio(servicio);

        presupuestoRepositorio.save(presupuesto);
    }

    public List<Presupuesto> listarPresupuestos() {

        List<Presupuesto> presupuestos = new ArrayList<>();

        presupuestos = presupuestoRepositorio.findAll();

        return presupuestos;
    }

    public void modificarPresupuesto(Long idPres, String Nombre, String idCliente, String idServ, Integer Valor) throws MiException {

        validar(idPres, Nombre, idCliente, idServ, Valor);
        
        Optional<Presupuesto> respuesta = presupuestoRepositorio.findById(idPres); //DEVUELVE TRUE Y LO CONVIERTE A GET
        Optional<Cliente> respuestaCliente = clienteRepositorio.findById(idCliente);
        Optional<Servicio> respuestaServicio = servicioRepositorio.findById(idServ);

        Cliente cliente = new Cliente();
        Servicio servicio = new Servicio();

        if (respuestaCliente.isPresent()) {

            cliente = respuestaCliente.get();
        }

        if (respuestaServicio.isPresent()) {

            servicio = respuestaServicio.get();
        }

        if (respuesta.isPresent()) {

            Presupuesto presupuesto = respuesta.get();

            presupuesto.setNombre(Nombre);

            presupuesto.setCliente(cliente);

            presupuesto.setServicio(servicio);

            presupuesto.setValor(Valor);

            presupuestoRepositorio.save(presupuesto);
        }

    }
    
    private void validar (Long idPres, String Nombre, String idCliente, String idServ, Integer Valor) throws MiException {
        
        if (idPres == null) {
            throw new MiException("El ID del presupuesto no puede ser nulo.");
        }

        if (Nombre.isEmpty() || Nombre == null) {
            throw new MiException("El Nombre del presupuesto no puede ser nulo o estar en blanco.");
        }

        if (Valor == null) {
            throw new MiException("El Valor del presupuesto no puede ser nulo.");
        }

        if (idCliente.isEmpty() || idCliente == null) {
            throw new MiException("El ID del cliente del presupuesto no puede ser nulo o estar en blanco.");
        }

        if (idServ.isEmpty() || idServ == null) {
            throw new MiException("El ID del servicio del presupuesto no puede ser nulo o estar en blanco.");
        }
    }

}
