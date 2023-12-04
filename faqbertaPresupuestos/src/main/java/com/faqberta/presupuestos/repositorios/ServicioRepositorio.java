package com.faqberta.presupuestos.repositorios;

import com.faqberta.presupuestos.entidades.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioRepositorio extends JpaRepository<Servicio, String> {

}
