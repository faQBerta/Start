package geometricshapes.services;

import geometricshapes.entities.Rectangle;

public class RectangleServices extends Rectangle {

    @Override
    public double createArea() {
        area = (perimeter / 6) * (perimeter / 3);
        return area;
    }

    public Rectangle makeRectangule() {
        super.makeShape();
        return new Rectangle(area, perimeter);
    }

    
}
