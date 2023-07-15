package energizapp.servicios;

import energizapp.entidades.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

public class ServRutina {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); //ISO-8859-1 PERMITE USAR Ñ Y TILDES

    public Rutina registrarRutina() {
        System.out.print("ID: ");
        int id;
        do {
            id = leer.nextInt();
        } while (Integer.toString(id).length()!=1);
        System.out.print("Nombre: ");
        String nombre;
        do {
            nombre = leer.next();
        } while (nombre.length()>50);
        System.out.print("Duracion: ");
        int duracion;
        do {
            duracion = leer.nextInt();
        } while (duracion>120);
        System.out.print("Nivel de dificultad: ");
        int nivelDificultad;
        do {
        nivelDificultad = leer.nextInt();
        } while (nivelDificultad>5);                
        System.out.print("Descripcion: ");
        String descripcion = leer.next();

        return new Rutina(id, duracion, nivelDificultad, descripcion, nombre);
    }

    public void obtenerRutina(ArrayList<Rutina> lR) {
        for (int i = 0; i < lR.size(); i++) {
            System.out.println(lR.get(i));
        }
    }

    public void actualizarRutina(ArrayList<Rutina> lR) {  //AQUI DESCUBRIMOS QUE SE PUEDE USAR GETTER Y SETTER CON FOR EACH
        System.out.print("Ingrese el ID de la rutina a modificar: ");
        int id = leer.nextInt();

        for (Rutina rutina : lR) {
            if (rutina.getId() == id) {
                System.out.println("Se encontro esa rutina. A continuacion los datos ingresados modificaran los anteriores: ");
                System.out.print("Nombre: ");
                String nombre = leer.next();
                System.out.print("Duracion: ");
                int duracion = leer.nextInt();
                System.out.print("Nivel de dificultad: ");
                int nivelDificultad = leer.nextInt();
                System.out.print("Descripcion: ");
                String descripcion = leer.next();
                System.out.println("");
                System.out.println(id + " actualizado.");
                break;
            }
        }

    }

    public void eliminarRutina(ArrayList<Rutina> lR) {
        System.out.print("Ingrese el ID de la rutina a eliminar: ");
        int id = leer.nextInt();

        for (Rutina rutina : lR) {
            if (rutina.getId() == id) {
                lR.remove(rutina);
                System.out.println("");
                System.out.println(id + " eliminado.");
                break;
            }
        }
    }

}
