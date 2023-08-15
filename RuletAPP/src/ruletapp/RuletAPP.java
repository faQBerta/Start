package ruletapp;

import java.util.ArrayList;
import ruletapp.entities.Game;
import ruletapp.entities.Player;
import ruletapp.entities.WaterStir;

public class RuletAPP {

    public static void main(String[] args) {
        WaterStir r = new WaterStir();
        ArrayList<Player> jugadores = new ArrayList();
                
        for (int i = 0; i < 6; i++) {
            Player p = new Player(i+1);
            jugadores.add(p);
        }
                
        Game rR = new Game();
        
        rR.fillGame(jugadores, r);
        
        rR.round();

    }
   
}
