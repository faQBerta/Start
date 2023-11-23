package com.faqberta.presupuestos.entidas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Servicio {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String idServ;
    private String nombre;

    public Servicio() {
    }

    public String getIdServ() {
        return idServ;
    }

    public void setIdServ(String id) {
        this.idServ = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
