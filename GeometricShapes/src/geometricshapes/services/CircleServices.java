package geometricshapes.services;

import geometricshapes.entities.Circle;

public class CircleServices extends Circle {

    @Override
    public double createArea() {
        area = (perimeter * perimeter) / (4 * PI);
        return area;
    }

    public Circle makeCircle() {
        super.makeShape();
        return new Circle(area, perimeter);
    }

}
