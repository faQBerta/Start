package Servicios;

import Entidad.Persona;
import java.util.Scanner;

public class servPersona {

    Persona pers = new Persona();
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("Ingrese su nombre completo: ");
        pers.setNombre(leer.nextLine());

        System.out.println("Ingrese su edad: ");
        pers.setEdad(leer.nextInt());

        System.out.println("Sexo: ");
        System.out.println("Masculino = M || Femenino = F || Otro = O");
        do {
            pers.setSexo(leer.next().toUpperCase());
            switch (pers.getSexo()) {
                case "M":
                    pers.setSexo("Masculino");
                    break;
                case "F":
                    pers.setSexo("Femenino");
                    break;
                case "O":
                    pers.setSexo("Otro");
                    break;
                default:
                    System.out.println("El sexo indicado no coincide con los disponibles, por favor intente nuevamente: ");
            }
        } while (!pers.getSexo().equals("Masculino") && !pers.getSexo().equals("Femenino") && !pers.getSexo().equals("Otro"));

        System.out.println("Ingrese peso (en kg con los decimales despues de un punto):");
        pers.setPeso(leer.nextDouble());

        System.out.println("Ingrese su altura (en m con los decimales despues de un punto): ");
        pers.setAltura(leer.nextDouble());
        return pers;
    }

    public int calcularIMC() {
        double IMCreturn;
        int IMC;

        IMCreturn = pers.getPeso() / (pers.getAltura() * pers.getAltura());

        if (IMCreturn < 20) {
            IMC = -1;
        } else if (IMCreturn > 20 && IMCreturn < 25) {
            IMC = 0;
        } else {
            IMC = 1;
        }

        switch (IMC) {
            case -1:
                System.out.println("Esta por dejabo de su peso corporal ideal.");
                break;
            case 0:
                System.out.println("Se encuentra en su peso ideal.");
                break;
            case 1:
                System.out.println("Esta por encima de peso corporal ideal");
                break;
        }
        return IMC;
    }

    public boolean esMayorDeEdad() {
        boolean emde = false;
        if (pers.getEdad() > 18) {
            emde = true;
        }
        return emde;
    }
}
