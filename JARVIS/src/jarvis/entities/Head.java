package jarvis.entities;

import jarvis.services.ArmorService;

public class Head extends ArmorService {

    protected boolean console, synthesizer;
    protected int conEnergy, synEnergy;

    //specific head
    public Head(boolean console, boolean synthesizer, int conEnergy, int synEnergy) {
        this.console = console;
        this.synthesizer = synthesizer;
        this.conEnergy = conEnergy;
        this.synEnergy = synEnergy;
    }

    //default head
    public Head() {
        this.console = false;
        this.synthesizer = false;
        this.conEnergy = 0;
        this.synEnergy = 0;
    }

    @Override
    public String toString() {
        return "Head's console is " + console + ", with " + conEnergy + "% of energy and a synthesizer " + synthesizer + " at " + synEnergy + "% .";
    }
    
    

}
