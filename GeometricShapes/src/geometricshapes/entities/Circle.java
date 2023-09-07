package geometricshapes.entities;

import geometricshapes.services.ShapeServices;

public class Circle extends ShapeServices {
    protected double radius;

    public Circle(double area, double perimeter) {
        super(area, perimeter);
        this.radius = perimeter/(2*PI);
    }

    public Circle() {
        this.radius=0;
    }

    @Override
    public String toString() {
        return "Circle with " + "radius= " + radius + '.';
    }


}
