package model;

import model.journey.RouteLeg;

import java.util.Vector;

/**
 * Created by C1575287 on 07/03/2016.
 */
public class WorldMap {
    Vector<RouteLeg> locations = new Vector<RouteLeg>();

    public WorldMap(){}

    public void plot(RouteLeg legs){
        locations.add(legs);
    }

    private String currentLocation(int index){
         return ""; //locations.name; //locations.get(index);
    }

    private double DistanceTraveld(){
        return 0.0;
    }


}
