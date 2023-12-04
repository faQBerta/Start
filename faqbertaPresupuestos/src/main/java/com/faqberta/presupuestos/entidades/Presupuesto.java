package com.faqberta.presupuestos.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Presupuesto implements Serializable {

    @Id
    private Long idPres;
    private String Nombre;
    private Integer Valor;

    @Temporal(TemporalType.DATE)
    private Date reserva;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Servicio servicio;

    public Presupuesto() {
    }

    public Long getIdPres() {
        return idPres;
    }

    public void setIdPres(Long idPres) {
        this.idPres = idPres;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getValor() {
        return Valor;
    }

    public void setValor(Integer Valor) {
        this.Valor = Valor;
    }

    public Date getReserva() {
        return reserva;
    }

    public void setReserva(Date reserva) {
        this.reserva = reserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

}
