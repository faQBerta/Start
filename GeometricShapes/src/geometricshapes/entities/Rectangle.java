package geometricshapes.entities;

import geometricshapes.services.ShapeServices;

public class Rectangle extends ShapeServices {

    protected double base, large;

    public Rectangle(double area, double perimeter) {
        super(area, perimeter);
        this.base = perimeter / 6;
        this.large = perimeter / 3;
    }

    public Rectangle() {
        this.base=0;
        this.large=0;
    }

    @Override
    public String toString() {
        return "Rectangle with " + "base= " + base + " and large= " + large + '.';
    }
    
    



}
