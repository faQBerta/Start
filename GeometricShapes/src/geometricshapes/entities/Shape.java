package geometricshapes.entities;

public class Shape {
    
    protected double area;
    protected double perimeter;

    public Shape(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public Shape() {
        this.area=0;
        this.perimeter=0;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Area= " + area + ", perimeter= " + perimeter + ".";
    }
    
    
    
}
