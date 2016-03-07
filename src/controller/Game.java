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
        Creature alien = new Creature("Jazzo from outta' space", "E.T", new Point(0, 0));
        Vehicle player = new Vehicle(alien, "flying saucer", 500);

        // plot co-ordinates for locations on earth
        WorldMap earth = new WorldMap();
        earth.plot(new RouteLeg(new Point(0,0, new Location("texas")), new Point(3,5, new Location("china"))));
        earth.plot(new RouteLeg(new Point(3,5, new Location("wales")), new Point(10,10, new Location("bombay"))));

        // plot co-ordinates for locations on the moon
        WorldMap moon = new WorldMap();
        earth.plot(new RouteLeg(new Point(0,0, new Location("moon landing site")), new Point(3,5, new Location("giant crater"))));

        milkyWay.addPlanet(new Planet("earth", 5.55, 234213422, earth));
        milkyWay.addPlanet(new Planet("moon", 1.24, 0, moon));



        Scanner console = new Scanner(System.in);

        while(console.hasNextLine()){
            // get i/o, do stuff.
            System.out.println("move: N, E, S, W");
            String input = console.next();
            alien.move(input);
            // distance travel'd and time taken in vehicle

            HUD.update();
        }
    }





    private void test(){

    }

}
