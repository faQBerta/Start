package makeelectrodomestic.entities;

import java.util.Scanner;

public class Electrodomestic {

    protected Double price, weight;
    protected String color;
    protected Character energyConsumption;

    Scanner leer;

    public Electrodomestic() {
    }

    public Electrodomestic(Double price, Double weight, String color, Character energyConsumption) {
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.energyConsumption = energyConsumption;
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

    private void checkEnergy(Character energyConsumption) {
        if (energyConsumption < 'A' || energyConsumption > 'F') {
            this.energyConsumption = 'F';
        }
    }

    private void checkColor(String color) {
        if (!color.equalsIgnoreCase("azul") || !color.equalsIgnoreCase("rojo") || !color.equalsIgnoreCase("negro") || !color.equalsIgnoreCase("gris") || !color.equalsIgnoreCase("blanco")) {
            this.color = "blanco";
        }
    }

    private void finalPrice(Double price) {
        switch (this.energyConsumption) {
            case 'A':
                price = 1000d;
                break;
            case 'B':
                price = 800d;
                break;
            case 'C':
                price = 600d;
                break;
            case 'D':
                price = 500d;
                break;
            case 'E':
                price = 300d;
                break;
            case 'F':
                price = 100d;
                break;
        }

        if (this.weight > 80) {
            this.price = price + 1000d;
        } else if (this.weight > 50) {
            this.price = price + 800d;
        } else if (this.weight > 20) {
            this.price = price + 500d;
        } else if (this.weight > 1) {
            this.price = price + 100d;
        }

    }

    public void makeElectrodomestic() {
        leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.print("Peso: ");
        weight = leer.nextDouble();
        System.out.print("Color: ");
        color = leer.next();
        checkColor(color);
        System.out.print("Consumo energetico: ");
        energyConsumption = leer.next().toUpperCase().charAt(0);
        checkEnergy(energyConsumption);
        price = 1000d;
        finalPrice(price);
    }

}
