package jarvis;

import jarvis.entities.Armor;
import jarvis.services.ArmorService;

public class JARVIS {
    //tony stark's artificial inteligence

    public static void main(String[] args) {

        Armor ironman;
        ArmorService imService = new ArmorService();

        ironman = imService.createFullArmor();

        System.out.println(ironman.toString());

        //for i seconds
        for (int i = 0; i < 10; i++) {
            imService.fly(ironman);
        }
        
        //its working but now I have to make a connection with the head...18/09/23
        System.out.println(ironman.getLhpEnergy());
    }

}
