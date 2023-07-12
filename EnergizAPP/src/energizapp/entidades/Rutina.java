package energizapp.entidades;

public class Rutina {

    private int id, duracion, nivelDificultad;
    private String descripcion, nombre;

    public Rutina() {
    }

    public Rutina(int id, int duracion, int nivelDificultad, String descripcion, String nombre) {
        this.id = id;
        this.duracion = duracion;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion < 121) {
            this.duracion = duracion;
        } else {
            System.out.print("Muy larga. No se guardo un valor.");
        }
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        if (nivelDificultad < 6) {
            this.nivelDificultad = nivelDificultad;
        } else {
            System.out.print("Mayor a 5. No se guardo un valor.");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Rutina{" + "id=" + id + ", duracion=" + duracion + ", nivelDificultad=" + nivelDificultad + ", descripcion=" + descripcion + ", nombre=" + nombre + '}';
    }

}
