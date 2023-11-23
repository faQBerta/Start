package com.faqberta.presupuestos.repositorios;

import com.faqberta.presupuestos.entidas.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, String> {

}
