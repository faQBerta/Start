package Servicios;

import Entidad.Alquiler;
import java.time.LocalDate;
import java.util.Scanner;

public class AlquilerServicio {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    Alquiler alquilado = new Alquiler();


    public Alquiler crearAlquiler() {
        System.out.print("Pelicula a alquilar:");
        alquilado.setPeliculaAlquilada(leer.nextLine()); ///////ESTO TENEMOS QUE RESOLVER PARA NO INVENTAR PELICULAS ALQUILADAS
        System.out.println("Alquila desde:");
        System.out.print("Dia: ");
        int fechaInicioDia = leer.nextInt();
        System.out.print("Mes: ");
        int fechaInicioMes = leer.nextInt();
        System.out.print("Año: "); 
        int fechaInicioAno = leer.nextInt();
        
        LocalDate fechaInicio = LocalDate.of(fechaInicioAno, fechaInicioMes, fechaInicioDia);
        alquilado.setFechaInicio(fechaInicio);

        boolean auxFecha = false;
        
        do {
            System.out.println("Alquiler valido hasta:");
            System.out.print("Dia: ");
            int fechaFinalDia = leer.nextInt();
            System.out.print("Mes: ");
            int fechaFinalMes = leer.nextInt();
            System.out.print("Año: ");
            int fechaFinalAno = leer.nextInt();
            LocalDate fechaFinal = LocalDate.of(fechaFinalAno, fechaFinalMes, fechaFinalDia);

            if (fechaInicio.isBefore(fechaFinal)) {
                alquilado.setFechaFinal(fechaFinal);
                auxFecha = true;
            }
        } while (!auxFecha);
        
        System.out.print("Precio:");
        alquilado.setPrecio(leer.nextInt());
        return alquilado;
    }
    
    public String listarAlquilado(){
        String peliculaAlquilada;
        return peliculaAlquilada = alquilado.getPeliculaAlquilada();
    }

    public void buscarAlquiler (int ano, int mes, int dia){ 
            LocalDate busqueda = LocalDate.of(ano, mes, dia);
            
            if (busqueda.equals(alquilado.getFechaInicio())) {
                System.out.print("Ese dia se alquilo: " + alquilado.getPeliculaAlquilada());
        }
    }
    

}
