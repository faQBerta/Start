package jarvis.services;

import jarvis.entities.Head;
import jarvis.interfaces.HeadAction;

public class HeadService extends Head implements HeadAction {

    //every part its going to have a specific creation
    @Override
    public void console() {
        this.console = true;
        this.conEnergy = 100;
    }

    @Override
    public void synthesizer() {
        this.synthesizer = true;
        this.synEnergy = 100;
    }

    public Head createHead() {
        console();
        synthesizer();
        return new Head();
    }

    //energy consumption
    public void write() {
        this.conEnergy = this.conEnergy - 1;
    }

    public void read() {
        this.batEnergy = this.batEnergy - 1;
    }

}
