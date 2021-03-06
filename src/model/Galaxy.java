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

    public void blackHole(){
        String planetNames = "";
        for (int i = 0; i < planets.size(); i++){
            planetNames += planets.get(i).name + ", ";
        }
        System.out.println(planetNames + " get sucked up into a black hole.. ");
        // delete all objects on heap
    }

    public void getPlanets(){
        String planetNames = "Available planets are: ";
        for (int i = 0; i < planets.size(); i++){
            if(i < planets.size() - 2){
                planetNames += planets.get(i).name + ", ";
            }else if(i < planets.size() - 1){
                planetNames += planets.get(i).name + " ";
            }else{
                planetNames += "and " + planets.get(i).name + ".";
            }
        }
        System.out.println(planetNames);
        // delete all objects on heap
    }

}
