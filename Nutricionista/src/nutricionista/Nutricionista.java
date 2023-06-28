package nutricionista;

import Servicios.servPersona;

public class Nutricionista {

    public static void main(String[] args) {
        System.out.println("Analizaremos 4 personas.");
        servPersona[] people;
        people = new servPersona[4];
        int[] imc = new int[4];
        boolean[] edad = new boolean[4];

        for (int i = 0; i < 4; i++) {
            people[i] = new servPersona();
            people[i].crearPersona();
            people[i].calcularIMC();
            people[i].esMayorDeEdad();
        }

        int debPeso, enPeso, supPeso;
        debPeso = 0;
        enPeso = 0;
        supPeso = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("La persona " + (i+1) + ":");
            imc[i] = people[i].calcularIMC();
            switch (imc[i]) {
                case -1:
                    debPeso = 25 + debPeso;
                    break;
                case 0:
                    enPeso = 25 + enPeso;
                    break;
                case 1:
                    supPeso = 25 + supPeso;
            }
        }
        System.out.println("Hay un " + debPeso + "% de personas con el peso por debajo del ideal.");
        System.out.println("Hay un " + enPeso + "% de personas con el peso ideal.");
        System.out.println("Hay un " + supPeso + "% de personas con el peso por encima del ideal.");

        int menEdad, mayEdad;
        menEdad = 0;
        mayEdad = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("La persona " + (i+1) + ":");
            edad[i] = people[i].esMayorDeEdad();
            if (edad[i]) {
                System.out.println("Es mayor de edad.");
                mayEdad++;
            } else {
                System.out.println("Es menor de edad.");
                menEdad++;
            }

        }
        System.out.println("Hay " + mayEdad + " mayores de edad.");
        System.out.println("Hay " + menEdad + " menores de edad.");
    }

}
