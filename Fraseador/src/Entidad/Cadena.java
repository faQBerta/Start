package Entidad;

public class Cadena {
        private String frase;
        private int largo;

    public Cadena() {
    }

    public Cadena(String frase, int largo) {
        this.frase = frase;
        this.largo = largo;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
        

    
}
