package energizapp;

import energizapp.entidades.Cliente;
import energizapp.servicios.ServCliente;
import java.util.ArrayList;

public class EnergizAPP {

    public static void main(String[] args) {
        ServCliente sC = new ServCliente();

        //////////////REGISTRAR 5 CLIENTES
        ArrayList<Cliente> lC = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Cliente c = sC.registrarCliente();
            lC.add(c);
        }

        ////////////// OBTENER LISTA DE CLIENTES
        sC.obtenerClientes(lC);

        ////////////// ACTUALIZAR CLIENTES
        sC.actualizarCliente(lC);

    }
}
