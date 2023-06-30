package Servicios;

import Entidad.Pelicula;
import java.util.Scanner;

public class PeliculaServicio {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    Pelicula peli = new Pelicula();

    public Pelicula crearPelicula() {
        System.out.print("Titulo de pelicula:");
        peli.setTitulo(leer.next());
        System.out.print("Genero:");
        peli.setGenero(leer.next());
        System.out.print("Año:");
        peli.setAño(leer.nextInt());
        System.out.print("Duracion en minutos:");
        peli.setDuracionMin(leer.nextInt());
        return peli;
    }

    public String listarPelicula() {
        String tituloPelicula;
        return tituloPelicula = peli.getTitulo();
    }

    public void buscarPelicula(String busqueda) {
        if (busqueda.equalsIgnoreCase(peli.getTitulo())) {
            System.out.println(peli.getTitulo());
    }
    }

    public void buscarGenero(String busqueda) {
        if (busqueda.equalsIgnoreCase(peli.getGenero())) {
            System.out.println(peli.getTitulo());
        }
    }
}
