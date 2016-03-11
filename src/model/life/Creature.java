package model.life;

import model.WorldMap;
import model.journey.Point;

/**
 * Created by C1575287 on 07/03/2016.
 */
public class Creature extends Organism{

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

    public static void move(Creature creature, String dir, WorldMap map){
        // switch: if == "n" this.pos.y + 1, "s" == this.pos.y- 1
        // default: if no location match then print "nothing but land, keep exploring";

        switch(dir.toUpperCase()){
            case "N": creature.pos.moveN(); // set y
                      break;
            case "E": creature.pos.moveE(); // set y
                      break;
            case "S": creature.pos.moveS(); // set y
                      break;
            case "W": creature.pos.moveW(); // set y
                      break;
            default:  System.out.println("insert a direction dummy");
        }

        creature.pos.isOutOfBounds(map);

        System.out.println(creature.name + " " + creature.pos.currentPosition());
        drainPetrol(1);
    }

    private static void drainPetrol(int n){
        // vehicle petrol - n;
    }


}
