package ruletapp.entities;

import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players = new ArrayList();
    private WaterStir wS;

    public void fillGame(ArrayList<Player> jugadores, WaterStir r) {
        players.addAll(jugadores);
        wS = r;
    }

    public void round() {
        for (Player player : players) {
            player.shoot(wS);
        }
        for (Player player : players) {
            System.out.println(player.toString());
            if (player.shoot(wS)) {
                break;
            }
        }
    }
}
