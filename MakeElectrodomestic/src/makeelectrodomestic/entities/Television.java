package makeelectrodomestic.entities;

import java.util.Scanner;

public class Television extends Electrodomestic {

    protected Boolean TDTSintonizator;

    public Television() {
    }

    public Television(Boolean TDTSintonizator, Double price, Double weight, String color, Character energyConsumption) {
        super(price, weight, color, energyConsumption);
        this.TDTSintonizator = false;
    }

    public Boolean getTDTSintonizator() {
        return TDTSintonizator;
    }

    public void setTDTSintonizator(Boolean TDTSintonizator) {
        this.TDTSintonizator = TDTSintonizator;
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

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public Television makeTelevision() {
        super.makeElectrodomestic();
        leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.print("TDT Sintonizator: ");
        String confirmation;
        confirmation = leer.next().toUpperCase();
        if (confirmation.equals("SI")) {
            TDTSintonizator = true;
        }
        if (TDTSintonizator) {
            this.price = price + 500d;
        }

        return new Television(TDTSintonizator, price, weight, color, energyConsumption);
    }

}
