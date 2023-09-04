package makeelectrodomestic.entities;

import java.util.Scanner;

public class WashingMachine extends Electrodomestic {
    protected Double charge;

    public WashingMachine() {
    }

    public WashingMachine(Double charge, Double price, Double weight, String color, Character energyConsumption) {
        super(price, weight, color, energyConsumption);
        this.charge = charge;
    }

    public Double getCharge() {
        return charge;
    }

    public void setCharge(Double charge) {
        this.charge = charge;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(Character energyConsumption) {
        this.energyConsumption = energyConsumption;
    }
    
    public WashingMachine makeWashingMachine() {
    super.makeElectrodomestic();
    leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.print("Charge: ");
        charge = leer.nextDouble();
    return new WashingMachine(charge, price, weight, color, energyConsumption);
}
    
    
}
