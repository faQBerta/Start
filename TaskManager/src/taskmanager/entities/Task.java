package taskmanager.entities;

public class Task {

    private String nombre;
    private int duracion;
    private boolean estado;

    public Task() {
    }

    public Task(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.estado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String estadito = "realizado.";
        if (!estado) {
            estadito = "no realizado.";
        }
        return "Nombre= " + nombre + ", " + estadito;
    }
    
}


