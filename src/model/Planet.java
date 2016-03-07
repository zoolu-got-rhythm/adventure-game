package model;

/**
 * Created by C1575287 on 07/03/2016.
 */
public class Planet {

    String name;
    double mass;
    long population;
    WorldMap map;



    public Planet(String name, double mass, long population, WorldMap map){
        this.name = name;
        this.mass = mass;
        this.population = population;
        this.map = map;
    }

    public void destinations(){
        System.out.println("this planet contains " + map.locations.size() + " destinations");
    }




}
