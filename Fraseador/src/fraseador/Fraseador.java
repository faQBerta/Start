package fraseador;

import Servicios.ServCadena;
import java.util.Scanner;

public class Fraseador {

    public static void main(String[] args) {
        ServCadena cadena = new ServCadena();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        cadena.crearCadena();
        System.out.println("==========");

        cadena.mostrarVocales();
        System.out.println("==========");

        cadena.invertirFrase();
        System.out.println("==========");

        System.out.print("¿Que letra desea ver cuantas veces se repite? ");
        cadena.vecesRepetido(leer.next());
        System.out.println("==========");

        System.out.println("Ingrese la frase con la que desea comparar la longitud: "); 
        cadena.compararLongitud(leer.next());
        System.out.println("==========");
        System.out.println("Ingrese una frase para unir a la frase original:");
        cadena.unirFrases(leer.next());
        System.out.println("==========");
        
        System.out.println("Ingrese una letra que desea reemplazar por la letra 'a':");
        cadena.reemplazar(leer.next());
        System.out.println("==========");
        
        System.out.println("Que letra le interesa saber si se encuentra en la frase?");
        cadena.contiene(leer.next());
        System.out.println("==========");
        System.out.println("GRACIAS POR USAR EL FRASEADOR2000.");
    }

}
