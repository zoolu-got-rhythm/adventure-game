package model.journey;

import model.Location;

/**
 * Created by C1575287 on 07/03/2016.
 */
public class RouteLeg {

    Point a;
    Point b;


    public RouteLeg(Point a, Point b){
        this.a = a;
        this.b = b;
    }

    // do I need to write an overload constructor?

    public double getDistance(){

        int x = this.b.x - this.a.x;
        double xSquared = x * x;
        int y = this.b.y - this.a.y;
        double ySquared = y * y;
        double distance = Math.sqrt(xSquared + ySquared);

        return distance;

    }
}
