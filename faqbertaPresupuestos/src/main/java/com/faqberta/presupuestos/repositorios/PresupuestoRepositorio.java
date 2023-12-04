package com.faqberta.presupuestos.repositorios;

import com.faqberta.presupuestos.entidades.Presupuesto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PresupuestoRepositorio extends JpaRepository<Presupuesto, Long> {

    @Query("SELECT p FROM Presupuesto p WHERE p.idPres = :idPres")
    public Presupuesto buscarPorTitulo(@Param("idPres") Long idPres);

    @Query("SELECT p FROM Presupuesto p WHERE p.cliente.nombre = :nombre")
    public List<Presupuesto> buscarPorCliente(@Param("nombre") String nombre);

}
