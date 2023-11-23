package com.faqberta.presupuestos.servicios;

import com.faqberta.presupuestos.entidas.Cliente;
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
    public void crearCliente (String nombre) {
        Cliente cliente = new Cliente();
        
        cliente.setNombre(nombre);
        
        clienteRepositorio.save(cliente);
    }
    
        public List<Cliente> listarPresupuestos() {
        
        List<Cliente> clientes = new ArrayList<>();
        
        clientes = clienteRepositorio.findAll();
        
        return clientes;
    }
        
    public void modificarCliente(String nombre, String id) {

        Optional<Cliente> respuesta = clienteRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Cliente cliente = respuesta.get();

            cliente.setNombre(nombre);

            clienteRepositorio.save(cliente);
        }
    }
    
}
