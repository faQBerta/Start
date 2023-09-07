package geometricshapes.services;

import geometricshapes.entities.Shape;
import geometricshapes.interfaces.ShapeAction;
import java.util.Scanner;

public class ShapeServices extends Shape implements ShapeAction {

    Scanner leer;

    public ShapeServices(double area, double perimeter) {
        super(area, perimeter);
    }

    public ShapeServices() {
    }


    @Override
    public double createPerimeter() {
        perimeter = leer.nextDouble();
        return perimeter;
    }
    
        @Override
    public double createArea() {
        return area;
    }
    
        public void makeShape() {
        leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Perimeter: ");
        perimeter = createPerimeter();
    }

}
