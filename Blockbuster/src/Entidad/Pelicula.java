package Entidad;

public class Pelicula {
    
    private String titulo, genero;
    private int año, duracionMin;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, int año, int duracionMin) {
        this.titulo = titulo;
        this.genero = genero;
        this.año = año;
        this.duracionMin = duracionMin;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }
    
    
    
}
