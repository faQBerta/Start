package jarvis.services;

import jarvis.entities.Armor;
import jarvis.interfaces.ArmorAction;
import java.util.Scanner;

public class ArmorService extends Armor implements ArmorAction {

    Scanner leer;

    //every part its going to have a specific creation
    @Override
    public void leftFootPropeller() {
        this.leftFootPropeller = true;
        this.lfpEnergy = 100;
    }

    @Override
    public void rightFootPropeller() {
        this.rightFootPropeller = true;
        this.rfpEnergy = 100;
    }

    @Override
    public void leftHandPropeller() {
        this.leftHandPropeller = true;
        this.lhpEnergy = 100;
    }

    @Override
    public void rightHandPropeller() {
        this.rightHandPropeller = true;
        this.rhpEnergy = 100;
    }

    @Override
    public void batery() {
        this.batery = true;
        this.batEnergy = 100;
    }

    @Override
    public void generator() {
        this.generator = true;
        this.genEnergy = 100;
    }

    public Armor createFullArmor() {
        leftFootPropeller();
        rightFootPropeller();
        leftHandPropeller();
        rightHandPropeller();
        batery();
        generator();
        return new Armor(primaryColor, secondaryColor, leftFootPropeller, rightFootPropeller, leftHandPropeller, rightHandPropeller, batery, generator, hardnessRockwell, heath, genEnergy, batEnergy, lhpEnergy, rhpEnergy, lfpEnergy, rfpEnergy);
    }

    //energy consumption with setters and getters
    public void run(Armor im) {
        im.setLfpEnergy(im.getLfpEnergy() - 2);
        im.setRfpEnergy(im.getRfpEnergy() - 2);
    }

    public void walk(Armor im) {
        im.setLfpEnergy(im.getLfpEnergy() - 1);
        im.setRfpEnergy(im.getRfpEnergy() - 1);
    }

    public void propeller(Armor im) {
        im.setLfpEnergy(im.getLfpEnergy() - 3);
        im.setRfpEnergy(im.getRfpEnergy() - 3);
        im.setLhpEnergy(im.getLhpEnergy() - 1);
        im.setRhpEnergy(im.getRhpEnergy() - 1);
    }

    public void fly(Armor im) {
        im.setLfpEnergy(im.getLfpEnergy() - 3);
        im.setRfpEnergy(im.getRfpEnergy() - 3);
        im.setLhpEnergy(im.getLhpEnergy() - 2);
        im.setRhpEnergy(im.getRhpEnergy() - 2);
    }

    public void shoot(Armor im) {
        im.setLhpEnergy(im.getLhpEnergy() - 3);
        im.setRhpEnergy(im.getRhpEnergy() - 3);
    }

}
