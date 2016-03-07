package model.life;

import model.journey.Point;

/**
 * Created by C1575287 on 07/03/2016.
 */
public class Creature {

    String name;
    // track players current position and moveIt() by 1 on x, y on an imaginary grid.
    Point pos;

    public Creature(String name, String race, Point origin){
        super();
        this.setRace(race);  // default race is "unknown"
        this.name = name;
        this.pos = origin;

    }

    private void damageTaken(int x){
        int currentHp = this.getHp();
        this.setHp(currentHp - x);
    }

    public void move(String dir){
        // switch: if == "n" this.pos.y + 1, "s" == this.pos.y- 1
        // default: if no location match then print "nothing but land, keep exploring";
        drainPetrol(1);
    }

    private void drainPetrol(int n){
        // vehicle petrol - n;
    }


}
