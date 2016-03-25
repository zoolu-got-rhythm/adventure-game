package controller;

import model.Galaxy;
import model.Location;
import model.Planet;
import model.WorldMap;
import model.journey.Point;
import model.journey.RouteLeg;
import model.life.Creature;
import model.life.Vehicle;
import view.HUD;

import java.util.Scanner;

/**
 * Created by C1575287 on 07/03/2016.
 */
public class Game {



    public static void main(String[] args) {
        // initialize and instantiate objects

        Galaxy milkyWay = new Galaxy();

        // create main player obj with origin point
        Creature alien = new Creature("Jazzo", "E.T", new Point(0, 0));
        Vehicle saucer = new Vehicle(alien, "flying saucer", 500);

        // plot co-ordinates for locations on earth
        WorldMap earth = new WorldMap(10, 10);
        earth.plot(new RouteLeg(new Point(0,0, new Location("texas")), new Point(3,5, new Location("china"))));
        earth.plot(new RouteLeg(new Point(3,5, new Location("wales")), new Point(10,10, new Location("bombay"))));

        // plot co-ordinates for locations on the moon
        WorldMap moon = new WorldMap(5, 5);
        earth.plot(new RouteLeg(new Point(0,0, new Location("moon landing site")), new Point(3,5, new Location("giant crater"))));

        milkyWay.addPlanet(new Planet("earth", 5.55, 234213422, earth));
        milkyWay.addPlanet(new Planet("moon", 1.24, 0, moon));



        Scanner console = new Scanner(System.in);

        // encapsulate this stuff into the HUD
        System.out.println("From the imagination of Carl Sagan comes:" );
        HUD.titleScreen();
        System.out.println("You are an: " + alien.race + " named: " + alien.name + ".");
        System.out.println("You've been selected by the government to do the annual survey of the milky way \nand to monitor the progress of mankind.");
        System.out.println("Please Select a planet: Earth, the moon"); //loop through galaxy planets

        while(console.hasNextLine()){
            // get i/o, do stuff.
            System.out.println("move: N, E, S, W");
            String input = console.next();

            // move Creature by x or y on planet x
            Creature.move(saucer.driver, input, earth); // static meth
            saucer.drainPetrol(1);
            // distance travel'd and time taken in vehicle

            HUD.update(input);
            HUD.vehicleInfo(saucer);
        }
    }





    private void test(){

    }

}
