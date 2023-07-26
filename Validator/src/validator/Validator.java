package validator;

import java.util.Scanner;
import validator.entities.PasswordValidator;

public class Validator {

    public static void main(String[] args) {
        //VALIDADOR DE CONTRASEÑAS CON PRIMERAS PRUEBAS UNITARIAS
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        PasswordValidator pv = new PasswordValidator();
        String password;
        
        do {
            System.out.print("Ingrese su contraseña: ");
            password = leer.next();
        } while (!pv.isValid(password));

        System.out.println("Contraseña segura.");
    }

}
