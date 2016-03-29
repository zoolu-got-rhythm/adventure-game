package model;

import model.journey.RouteLeg;
import model.life.Creature;

import java.util.Vector;

/**
 * Created by C1575287 on 07/03/2016.
 */
public class WorldMap {
    Vector<RouteLeg> locations = new Vector<RouteLeg>();
    int w;
    int h;

    public WorldMap(int width, int height){
        this.w = width;
        this.h = height;
    }

    public void plot(RouteLeg legs){
        locations.add(legs);
    }

    public String getLocation(Creature c){
        // switch statement: check current pos on point: if x and y == 0,2, locations.get(2);

        // loop through locations and check if any of their point.x and y's match with the currentPos,
        // if so run a method where you can check for their things.
//        for (int i = 0; i < locations.size(); i++){
//            if(c.pos.currentPosition() == locations.get(i).x){
//                System.out.println("you are at: " + locations.get(i).place.name);
//            }
//        }

        return ""; //locations.name; //locations.get(index)


    }

    private double DistanceTraveld(){
        return 0.0;
    }


    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }
}
