package model;

/**
 * Created by C1575287 on 07/03/2016.
 */
public class Location {
    String name;
    Thing n, e, s, w;



    public Location(String name){
        this.name = name;

        // assign random items.
        this.n = new Thing();
        this.e = new Thing();
        this.s = new Thing();
        this.w = new Thing();
    }

}
