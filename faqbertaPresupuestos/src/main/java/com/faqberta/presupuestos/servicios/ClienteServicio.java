package com.faqberta.presupuestos.servicios;

import com.faqberta.presupuestos.entidades.Cliente;
import com.faqberta.presupuestos.excepciones.MiException;
import com.faqberta.presupuestos.repositorios.ClienteRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicio {
    
    @Autowired
    ClienteRepositorio clienteRepositorio;
    
    @Transactional
    public void crearCliente (String nombre) throws MiException {
        
        validar(nombre, "asd");
        
        Cliente cliente = new Cliente();
        
        cliente.setNombre(nombre);
        
        clienteRepositorio.save(cliente);
    }
    
        public List<Cliente> listarClientes() {
        
        List<Cliente> clientes = new ArrayList<>();
        
        clientes = clienteRepositorio.findAll();
        
        return clientes;
    }
        
    public void modificarCliente(String nombre, String id) throws MiException {
        
        validar(nombre, id);

        Optional<Cliente> respuesta = clienteRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Cliente cliente = respuesta.get();

            cliente.setNombre(nombre);

            clienteRepositorio.save(cliente);
        }
    }
    
    private void validar(String nombre, String id) throws MiException{
        
        if (id.isEmpty() || id == null) {
            throw new MiException("El ID del cliente no puede ser nulo o estar en blanco.");
        }

        if (nombre.isEmpty() || nombre == null) {
            throw new MiException("El nombre del cliente no puede ser nulo o estar en blanco.");
        }

    }
    
}
