package Servicios;

import Entidad.Cadena;
import java.util.Scanner;

public class ServCadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ;
    Cadena cad = new Cadena();

    public Cadena crearCadena() {
        System.out.println("Ingrese la frase que desea analizar: ");
        cad.setFrase(leer.nextLine());
        cad.setLargo(cad.getFrase().length());
        return cad;
    }

    public void mostrarVocales() {
        char vocal;
        int vocala, vocale, vocali, vocalo, vocalu;
        vocala = 0;
        vocale = 0;
        vocali = 0;
        vocalo = 0;
        vocalu = 0;

        for (int i = 0; i < cad.getLargo(); i++) {
            vocal = cad.getFrase().charAt(i);
            switch (vocal) {
                case 'a':
                    vocala++;
                    break;
                case 'e':
                    vocale++;
                    break;
                case 'i':
                    vocali++;
                    break;
                case 'o':
                    vocalo++;
                    break;
                case 'u':
                    vocalu++;
                    break;
            }
        }
        System.out.println("Hay " + vocala + " vocales a.");
        System.out.println("Hay " + vocale + " vocales e.");
        System.out.println("Hay " + vocali + " vocales i.");
        System.out.println("Hay " + vocalo + " vocales o.");
        System.out.println("Hay " + vocalu + " vocales u.");
    }

    public void invertirFrase() {
        String frInv = "";
        for (int i = (cad.getLargo()); i > 0; i--) {
            frInv = frInv.concat(cad.getFrase().substring(i - 1, i));
        }
        System.out.println(frInv);
    }

    public void vecesRepetido(String letra) {
        int vocal = 0;
        for (int i = 0; i < cad.getLargo(); i++) {
            if (letra.equals(cad.getFrase().substring(i, i + 1))) {
                vocal++;
            }
        }
        System.out.println("Hay " + vocal + " letras " + letra + ".");
    }

    public void compararLongitud(String frase) {
        int largo1 = frase.length();
        int largo2 = cad.getLargo();

        if (largo1 == largo2) {
            System.out.println("Son del mismo largo.");
        } else {
            System.out.println("No son del mismo largo.");
        }

    }
    
    public void unirFrases(String frase) { 
        System.out.println(cad.getFrase().concat(frase));
    }

    public void reemplazar(String frase){
        System.out.println(cad.getFrase().replace("a", frase));
    }
    
    
    public void contiene(String frase){
        boolean contiene;
        
        contiene = cad.getFrase().contains(frase);
        
        if (contiene) {
            System.out.println("Si contiene la letra " + frase + ".");
        } else {
            System.out.println("No contiene la letra " + frase + ".");
        }
    }
}
