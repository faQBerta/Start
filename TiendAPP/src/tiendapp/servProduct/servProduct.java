package tiendapp.servProduct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import tiendapp.Product.Product;
import tiendapp.utilities.Comparador;

public class servProduct {

    HashMap<Integer, Product> productList = new HashMap();
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    int count = 1000000;

    public void menuProduct() {
        int opc;
            System.out.println("= = = = || ELMERCADITO || = = = =");
        do {
            System.out.println("" + "\n"
                    + "1. Ingresar un producto" + "\n"
                    + "2. Modificar precio" + "\n"
                    + "3. Eliminar un producto" + "\n"
                    + "4. Mostrar productos" + "\n"
                    + "5. Guardar y salir." + "\n"
                    + "|| = = = = = OPCION = = = = = ||");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    Product p = createProduct();
                    addProduct(p);
                    break;
                case 2:
                    modPrice();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    showProduct();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta.");
            }

        } while (opc != 5);
        System.out.println("= = = = || ELMERCADITO || = = = =" + "\n"
                + "|| = = = = = = EXIT = = = = = = ||");
    }

    private Product createProduct() {
        System.out.print("Nombre: ");
        String nombre = leer.next();
        System.out.print("Precio $");
        Double price = leer.nextDouble();
        System.out.print("Cantidad: ");
        Integer amount = leer.nextInt();
        return new Product(nombre, amount, price);
    }

    private void addProduct(Product p) {
        count++;
        productList.put(count, p);
        System.out.println("|| = = = = = AÑADIDO = = = = = ||");
    }

    private void modPrice() {
        System.out.print("Nombre de producto a modificar: ");
        String name = leer.next();

        for (Map.Entry<Integer, Product> it : productList.entrySet()) {
            Integer key = it.getKey();
            Product p = it.getValue();

            if (p.getProductName().equalsIgnoreCase(name)) {
                System.out.print("Inserte nuevo precio $");
                p.setPrice(leer.nextDouble());
            }
        }
    }

    private void deleteProduct() {
        System.out.print("Nombre de producto a eliminar: ");
        String name = leer.next();

        for (Map.Entry<Integer, Product> it : productList.entrySet()) {
            Integer key = it.getKey();
            Product p = it.getValue();

            if (p.getProductName().equalsIgnoreCase(name)) {
                productList.remove(key, p);
                System.out.println("|| = =  = = ELIMINADO = =  = = ||");
                return;
            }
        }
    }

    private void showProduct() {
        System.out.print("[N]ombre / [P]recio / [C]antidad : ");
        String name = leer.next().toUpperCase();

        List<Map.Entry<Integer, Product>> orderList = new ArrayList<>(productList.entrySet());

        switch (name) {

            case "N":
                Collections.sort(orderList, Comparador.compararNombre);
                for (Map.Entry<Integer, Product> it : orderList) {
                    System.out.println(it.getKey() + " | " + it.getValue());
                }
                break;

            case "P":
                Collections.sort(orderList, Comparador.compararPrecio);
                for (Map.Entry<Integer, Product> it : orderList) {
                    System.out.println(it.getKey() + " | " + it.getValue());
                }
                break;

            case "C":
                Collections.sort(orderList, Comparador.compararCantidad);
                for (Map.Entry<Integer, Product> it : orderList) {
                    System.out.println(it.getKey() + " | " + it.getValue());
                }
                break;
        }
        System.out.println("|| = = = = = ORDENADO = = = = = ||");
    }

}
