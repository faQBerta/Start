package energizapp.servicios;

import energizapp.entidades.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ServCliente {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); //ISO-8859-1 PERMITE USAR Ñ Y TILDES

    public Cliente registrarCliente() {
        System.out.print("ID: ");
        int id = leer.nextInt();
        System.out.print("Nombre: ");
        String nombre = leer.next();
        System.out.print("Edad: ");
        int edad = leer.nextInt();
        System.out.print("Altura: ");
        double altura = leer.nextDouble();
        System.out.print("Peso: ");
        double peso = leer.nextDouble();
        System.out.print("Objetivo: ");
        String objetivo = leer.next();
        return new Cliente(id, edad, nombre, objetivo, altura, peso);
    }

    public void obtenerCliente(ArrayList<Cliente> lC) {
        for (int i = 0; i < lC.size(); i++) {
            System.out.println(lC.get(i));
        }

    }

    public void actualizarCliente(ArrayList<Cliente> lC) {  //AQUI DESCUBRIMOS QUE SE PUEDE USAR GETTER Y SETTER CON FOR EACH
        System.out.print("Ingrese el ID del usuario a modificar: ");
        int id = leer.nextInt();

        for (Cliente cliente : lC) {
            if (cliente.getId() == id) {
                System.out.println("Se encontro ese cliente. A continuacion los datos ingresados modificaran los anteriores: ");
                System.out.print("Nombre :");
                cliente.setNombre(leer.next());
                System.out.print("Edad: ");
                cliente.setEdad(leer.nextInt());
                System.out.print("Altura: ");
                cliente.setAltura(leer.nextDouble());
                System.out.print("Peso: ");
                cliente.setPeso(leer.nextDouble());
                System.out.print("Objetivo: ");
                cliente.setObjetivo(leer.next());
                System.out.println("");
                System.out.println(id + " actualizado.");
                break;
            }
        }
    }

    public void eliminarCliente(ArrayList<Cliente> lC) {
        System.out.print("Ingrese el ID del usuario a eliminar: ");
        int id = leer.nextInt();

        for (Cliente cliente : lC) {
            if (cliente.getId() == id) {
                lC.remove(cliente);
                System.out.println("");
                System.out.println(id + " eliminado.");
                break;
            }
        }
    }
}
