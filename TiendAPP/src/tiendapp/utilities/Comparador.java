package tiendapp.utilities;

import java.util.Comparator;
import java.util.Map;
import tiendapp.Product.Product;

public class Comparador {

    public static Comparator<Map.Entry<Integer, Product>> compararNombre = new Comparator<Map.Entry<Integer, Product>>() {
        @Override
        public int compare(Map.Entry<Integer, Product> p1, Map.Entry<Integer, Product> p2) {
            Product p1Value = p1.getValue();
            Product p2Value = p2.getValue();
            return p1Value.getProductName().compareTo(p2Value.getProductName());
        }
    };

    public static Comparator<Map.Entry<Integer, Product>> compararPrecio = new Comparator<Map.Entry<Integer, Product>>() {
        @Override
        public int compare(Map.Entry<Integer, Product> p1, Map.Entry<Integer, Product> p2) {
            Product p1Value = p1.getValue();
            Product p2Value = p2.getValue();
            return p1Value.getPrice().compareTo(p2Value.getPrice());
        }
    };

    public static Comparator<Map.Entry<Integer, Product>> compararCantidad = new Comparator<Map.Entry<Integer, Product>>() {
        @Override
        public int compare(Map.Entry<Integer, Product> p1, Map.Entry<Integer, Product> p2) {
            Product p1Value = p1.getValue();
            Product p2Value = p2.getValue();
            return p1Value.getAmount().compareTo(p2Value.getAmount());
        }
    };

}
