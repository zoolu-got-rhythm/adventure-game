package model;

import java.util.Vector;

/**
 * Created by C1575287 on 07/03/2016.
 */
public class Location {
    String name;
    Thing n, e, s, w;
    // Vector[] things = new Vector<?>();

    public Location(String name){



        this.name = name;

        // assign random items.
        this.n = new Thing();
        this.e = new Thing();
        this.s = new Thing();
        this.w = new Thing();
    }

    // overload
    public Location(){
        this.name = nameGenerator();

        // assign random items.
        this.n = new Thing();
        this.e = new Thing();
        this.s = new Thing();
        this.w = new Thing();
    }

    private String nameGenerator(){
        int dice = (int) Math.round(Math.random() * 5);
        switch(dice){
            case 1: return "garden";
            case 2: return "forest";
            case 3: return "mountain";
            case 4: return "Spring";
            default: return "gorge";
        }
    }

    public static void main(String[] args){
        Location random = new Location();
        System.out.println(random.name);
        System.out.println(random.n.name);
    }

}
