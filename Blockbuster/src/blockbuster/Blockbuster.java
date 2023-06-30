package blockbuster;

import Servicios.AlquilerServicio;
import Servicios.PeliculaServicio;
import java.util.Scanner;

public class Blockbuster {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int contadorPelicula = 1;
        int contadorAlquiler = 1;

        PeliculaServicio[] arrayPeliculas = new PeliculaServicio[100];
        AlquilerServicio[] arrayAlquiler = new AlquilerServicio[100];

        int opc;

        do {
            System.out.println("========== || MENU || ==========");
            System.out.println("1)| Crear pelicula.");
            System.out.println("2)| Listar peliculas disponibles.");
            System.out.println("3)| Crear alquiler.");
            System.out.println("4)| Listar peliculas alquiladas.");
            System.out.println("5)| Buscar pelicula por titulo.");
            System.out.println("6)| Buscar pelicula por genero.");
            System.out.println("7)| Buscar alquiler por fecha.");
            System.out.println("8)| Calcular el ingreso total.");
            System.out.println("0)| SALIR.");
            opc = leer.nextInt();
            System.out.println("========== ||  " + opc + "  || ==========");

            switch (opc) {
                case 1:
                    arrayPeliculas[contadorPelicula - 1] = new PeliculaServicio();
                    arrayPeliculas[contadorPelicula - 1].crearPelicula();
                    contadorPelicula++;
                    break;

                case 2:
                    for (int i = 0; i < contadorPelicula - 1; i++) {
                        boolean check = false;
                            for (int j = 0; j < contadorAlquiler -1; j++) {
                                if (!arrayAlquiler[j].listarAlquilado().equalsIgnoreCase(arrayPeliculas[i].listarPelicula())) {
                                    check = true;
                                }
                            }
                        if (check) {
                            System.out.println(arrayPeliculas[i].listarPelicula());
                        }
                    }
                    break;

                case 3:
                    arrayAlquiler[contadorAlquiler - 1] = new AlquilerServicio();
                    arrayAlquiler[contadorAlquiler - 1].crearAlquiler();
                    contadorAlquiler++;
                    break;

                case 4:
                    for (int i = 0; i < contadorAlquiler - 1; i++) {
                        arrayAlquiler[i].listarAlquilado();
                    }
                    break;

                case 5:
                    String titulo;
                    System.out.print("Ingrese el titulo que desea:");
                    titulo = leer.nextLine();
                    for (int i = 0; i < contadorPelicula - 1; i++) {
                        arrayPeliculas[i].buscarPelicula(titulo);
                    }
                    break;

                case 6:
                    String genero;
                    System.out.print("Ingrese el genero que desea:");
                    genero = leer.nextLine();
                    for (int i = 0; i < contadorPelicula - 1; i++) {
                        arrayPeliculas[i].buscarGenero(genero);
                    }
                    break;

//                case 7:
//                    System.out.print("Año: ");
//                    int ano = leer.nextInt();
//                    System.out.print("Mes: ");
//                    int mes = leer.nextInt();
//                    System.out.print("Dia: ");
//                    int dia = leer.nextInt();
//
//                    for (int i = 0; i < contadorAlquiler - 1; i++) {
//                        arrayAlquiler[i].buscarAlquiler(ano, mes, dia);
//                    }
//                    break;
//
////                case 8:
////                    System.out.println(sc.contiene("z", c1));
////                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opción inválida. Debes seleccionar un número del 0 al 7.");
                    break;
            }

        } while (opc != 0);

    }
}
