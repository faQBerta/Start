
package geometricshapes;

import geometricshapes.entities.Shape;
import geometricshapes.services.CircleServices;
import geometricshapes.services.RectangleServices;

public class GeometricShapes {

    public static void main(String[] args) {

        Shape rect;
        RectangleServices rectServ = new RectangleServices();
        Shape circ;
        CircleServices circServ = new CircleServices();
        
        System.out.print("Make a rectangle with ");
        rect = rectServ.makeRectangule();
        
        System.out.print("Make a circle with ");
        circ = circServ.makeCircle();
        
        System.out.println("");
        System.out.println(rect.toString());
        System.out.println(circ.toString());
    }
    
}
