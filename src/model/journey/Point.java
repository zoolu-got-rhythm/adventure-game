package model.journey;

import model.Location;

/**
 * Created by C1575287 on 07/03/2016.
 */
public class Point {

    int x;
    int y;
    Location place;


    public Point(int x, int y, Location place){
        this.x = x;
        this.y = y;
        this.place = place;
    }

    // overload
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

}
