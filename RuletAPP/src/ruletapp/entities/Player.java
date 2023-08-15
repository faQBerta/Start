package ruletapp.entities;

public class Player {

    private Integer id;
    private String name;
    private Boolean wet;

    public Player() {
        this.wet = false;
    }

    public Player(Integer id) {
        this.id = id;
        this.name = "Jugador " + id.toString();
        this.wet = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getWet() {
        return wet;
    }

    public void setWet(Boolean wet) {
        this.wet = wet;
    }
    
    public boolean shoot(WaterStir r) {
       wet = r.wet();
        r.nextShot();
        return wet;
    }

    @Override
    public String toString() {
        if (wet) {
            return "Jugador " + id + ", mojado.";
        } else {
            return "Jugador " + id + ", no mojado.";
        }

    }

}
