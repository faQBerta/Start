package ruletapp.entities;

import java.util.Random;

public class WaterStir {

   private Random random = new Random();
   private Integer actualPos = random.nextInt(6) + 1;
   private Integer waterPos = random.nextInt(6) + 1;

    public boolean wet() {
        return (actualPos == waterPos);
    }

    public void nextShot() {
        if (actualPos == 6) {
           actualPos = 1;
        } else {
            actualPos++;
        }
    }

    @Override
    public String toString() {
        return "Posicion de disparo =" + actualPos + ", posicion de carga de agua=" + waterPos + ".";
    }

}
