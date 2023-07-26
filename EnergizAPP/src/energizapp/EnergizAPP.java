package energizapp;

import energizapp.entidades.Cliente;
import energizapp.entidades.Rutina;
import energizapp.servicios.ServCliente;
import energizapp.servicios.ServRutina;
import java.util.ArrayList;

public class EnergizAPP {

    public static void main(String[] args) {
        //CREAREMOS RUTINAS Y CLIENTES INDEPENDIENTES
        ServCliente sC = new ServCliente();
        ServRutina sR = new ServRutina();

        System.out.println("=========================================");
        System.out.println("");
        System.out.println("===========REGISTRO 1 CLIENTES===========");
        ArrayList<Cliente> lC = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            Cliente c = sC.registrarCliente();
            lC.add(c);
        }
        System.out.println("===========REGISTRO 1 RUTINAS============");
        ArrayList<Rutina> lR = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            Rutina r = sR.registrarRutina();
            lR.add(r);
        }

        System.out.println("=========================================");
        System.out.println("");
        System.out.println("============LISTA DE CLIENTES=============");
        sC.obtenerCliente(lC);
        System.out.println("============LISTA DE RUTINAS==============");
        sR.obtenerRutina(lR);

        System.out.println("==========================================");
        System.out.println("");
        System.out.println("============ACTUALIZAR CLIENTE============");
        sC.actualizarCliente(lC);

        System.out.println("============ACTUALIZAR RUTINA=============");
        sR.actualizarRutina(lR);

        System.out.println("==========================================");
        System.out.println("");
        System.out.println("=============ELIMINAR CLIENTE==============");
        sC.eliminarCliente(lC);
        System.out.println("=============ELIMINAR RUTINA===============");
        sR.eliminarRutina(lR);
        System.out.println("==========================================");

        System.out.println("================CLIENTES==================");
        sC.obtenerCliente(lC);
        System.out.println("================RUTINAS===================");
        sR.obtenerRutina(lR);
        System.out.println("");
        System.out.println("===========PROGRAMA TERMINADO===========");
    }
}
