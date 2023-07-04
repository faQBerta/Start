package Service;

import Thing.movil;
import java.util.Scanner;

public class movilService {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    //cargarCelular(): se solicita al usuario que ingrese los datos necesarios para instanciar un objeto Celular y poder cargarlo en nuestro programa.
    public movil cargarCelular() {
        System.out.print("Marca: ");
        String marca = leer.next();
        System.out.print("Modelo: ");
        String modelo = leer.next();
        System.out.print("Memoria RAM: ");
        int memoriaRam = leer.nextInt();
        System.out.print("Almacenamiento intero: ");
        int almacenamiento = leer.nextInt();
        System.out.print("Precio: U$D");
        double precio = leer.nextDouble();
        System.out.print("Codigo: ||");
        int[] codigo = ingresarCodigo();
        leer.close();
        return new movil(marca, modelo, memoriaRam, almacenamiento, precio, codigo);
    }

    //ingresarCodigo(): este método permitirá ingresar el código completo de siete números de un celular. Para ello, puede utilizarse un bucle repetitivo
    private int[] ingresarCodigo() {
        String numero;
        numero = leer.next();

        int[] codigo = new int[7];

        for (int i = 0; i < 7; i++) {
            codigo[i] = numero.charAt(i) - '0';
        }
        leer.close();
        return codigo;

    }

    //TEST CODIGO MOVIL
    public void mostrarCelu(movil m) {
        String celular = "";
        for (int i = 0; i < 7; i++) {
            celular = celular.concat(String.valueOf(m.getCodigo()[i]));
        }
        System.out.println("Codigo: ||" + celular);
    }
}
