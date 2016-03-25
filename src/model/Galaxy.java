package model;

import java.util.Vector;

/**
 * Created by C1575287 on 07/03/2016.
 */
public class Galaxy {
    Vector<Planet> planets = new Vector<Planet>();

    public Galaxy(){

    }

    public void addPlanet(Planet x){
        planets.addElement(x);
    }

    private void blackHole(){
        String planetNames = "";
        for (int i = 0; i < planets.size(); i++){
            planetNames += planets.get(i).name + ", ";
        }
        System.out.println(planetNames + " get sucked up into a black hole.. ");
        // delete all objects on heap
    }

}
