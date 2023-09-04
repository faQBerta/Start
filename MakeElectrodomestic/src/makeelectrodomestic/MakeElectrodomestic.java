package makeelectrodomestic;

import makeelectrodomestic.entities.Television;
import makeelectrodomestic.entities.WashingMachine;

public class MakeElectrodomestic {

    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        System.out.println("Lavadora");
        wm.makeWashingMachine();
        
        System.out.println("");        
        System.out.println("La lavadora se guardo asi:");
        System.out.println(wm.getEnergyConsumption());
        System.out.println(wm.getColor());
        System.out.println(wm.getPrice());
        System.out.println("");
        
        
        Television tv = new Television();
        System.out.println("Television");
        tv.makeTelevision();
        
        System.out.println("");
        System.out.println("La teve se guardo asi:");
        System.out.println(tv.getEnergyConsumption());
        System.out.println(tv.getColor());
        System.out.println(tv.getPrice());

    }
    
}
