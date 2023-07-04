package cellphoneshop;

import Service.movilService;
import Thing.movil;

public class CellphoneShop {

    public static void main(String[] args) {
        movilService mS = new movilService();

        System.out.println("Ingresar un nuevo celular: ");
        movil m1;
        m1 = mS.cargarCelular();
//        mS.mostrarCelu(m1); TEST CODIGO  MOVIL

        System.out.println("Celular ingresado correctamente.");
    }

}
