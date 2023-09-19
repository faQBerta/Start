package jarvis.entities;

public class Armor {
    //metallic skeleton

    protected String primaryColor, secondaryColor;
    protected boolean leftFootPropeller, rightFootPropeller, leftHandPropeller, rightHandPropeller, batery, generator;
    protected int hardnessRockwell, heath, genEnergy, batEnergy, lhpEnergy, rhpEnergy, lfpEnergy, rfpEnergy;

    //specific ironman

    public Armor(String primaryColor, String secondaryColor, boolean leftFootPropeller, boolean rightFootPropeller, boolean leftHandPropeller, boolean rightHandPropeller, boolean batery, boolean generator, int hardnessRockwell, int heath, int genEnergy, int batEnergy, int lhpEnergy, int rhpEnergy, int lfpEnergy, int rfpEnergy) {
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.leftFootPropeller = leftFootPropeller;
        this.rightFootPropeller = rightFootPropeller;
        this.leftHandPropeller = leftHandPropeller;
        this.rightHandPropeller = rightHandPropeller;
        this.batery = batery;
        this.generator = generator;
        this.hardnessRockwell = hardnessRockwell;
        this.heath = heath;
        this.genEnergy = genEnergy;
        this.batEnergy = batEnergy;
        this.lhpEnergy = lhpEnergy;
        this.rhpEnergy = rhpEnergy;
        this.lfpEnergy = lfpEnergy;
        this.rfpEnergy = rfpEnergy;
    }

    //default ironman
    public Armor() {
        this.primaryColor = "red";
        this.secondaryColor = "golden";
        this.hardnessRockwell = 9;
        this.leftFootPropeller = false;
        this.rightFootPropeller = false;
        this.leftHandPropeller = false;
        this.rightHandPropeller = false;
        this.batery = false;
        this.generator = false;
        this.heath = 100;
        this.genEnergy = 0;
        this.batEnergy = 0;
        this.lhpEnergy = 0;
        this.rhpEnergy = 0;
        this.lfpEnergy = 0;
        this.rfpEnergy = 0;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public boolean isLeftFootPropeller() {
        return leftFootPropeller;
    }

    public void setLeftFootPropeller(boolean leftFootPropeller) {
        this.leftFootPropeller = leftFootPropeller;
    }

    public boolean isRightFootPropeller() {
        return rightFootPropeller;
    }

    public void setRightFootPropeller(boolean rightFootPropeller) {
        this.rightFootPropeller = rightFootPropeller;
    }

    public boolean isLeftHandPropeller() {
        return leftHandPropeller;
    }

    public void setLeftHandPropeller(boolean leftHandPropeller) {
        this.leftHandPropeller = leftHandPropeller;
    }

    public boolean isRightHandPropeller() {
        return rightHandPropeller;
    }

    public void setRightHandPropeller(boolean rightHandPropeller) {
        this.rightHandPropeller = rightHandPropeller;
    }

    public boolean isBatery() {
        return batery;
    }

    public void setBatery(boolean batery) {
        this.batery = batery;
    }

    public boolean isGenerator() {
        return generator;
    }

    public void setGenerator(boolean generator) {
        this.generator = generator;
    }

    public int getHardnessRockwell() {
        return hardnessRockwell;
    }

    public void setHardnessRockwell(int hardnessRockwell) {
        this.hardnessRockwell = hardnessRockwell;
    }

    public int getHeath() {
        return heath;
    }

    public void setHeath(int heath) {
        this.heath = heath;
    }

    public int getGenEnergy() {
        return genEnergy;
    }

    public void setGenEnergy(int genEnergy) {
        this.genEnergy = genEnergy;
    }

    public int getBatEnergy() {
        return batEnergy;
    }

    public void setBatEnergy(int batEnergy) {
        this.batEnergy = batEnergy;
    }

    public int getLhpEnergy() {
        return lhpEnergy;
    }

    public void setLhpEnergy(int lhpEnergy) {
        this.lhpEnergy = lhpEnergy;
    }

    public int getRhpEnergy() {
        return rhpEnergy;
    }

    public void setRhpEnergy(int rhpEnergy) {
        this.rhpEnergy = rhpEnergy;
    }

    public int getLfpEnergy() {
        return lfpEnergy;
    }

    public void setLfpEnergy(int lfpEnergy) {
        this.lfpEnergy = lfpEnergy;
    }

    public int getRfpEnergy() {
        return rfpEnergy;
    }

    public void setRfpEnergy(int rfpEnergy) {
        this.rfpEnergy = rfpEnergy;
    }


    

    @Override
    public String toString() {
        return "Iron Man " + primaryColor + " with " + secondaryColor + ", made by " + hardnessRockwell + " hardness steel and is at " + heath + "% health.";
    }

}
