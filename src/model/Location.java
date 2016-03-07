package model;

/**
 * Created by C1575287 on 07/03/2016.
 */
public class Location {
    String name;
    String n, e, s, w = "";



    public Location(String name){
        this.name = name;
        this.n = "a wall";
        this.e = "an item";
        this.s = "an exit";
        this.w = "an create stands";
    }

}
