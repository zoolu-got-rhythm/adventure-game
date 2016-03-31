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
        Creature alien = new Creature("Jazzo", "E.T", new Point(3, 3));
        Vehicle saucer = new Vehicle(alien, "flying saucer", 500);

        // create 2 npc's
        Creature human = new Creature("Hill billy with pitchfork", "homo-sapien", new Point(5, 5));
        Vehicle tractor = new Vehicle(human, "tractor", 1000);

        Creature buzz = new Creature("Buzz Aldrin", "homo-sapien", new Point(3, 4));
        Vehicle buggy = new Vehicle(buzz, "space buggy", 1000);

        // plot co-ordinates for locations on earth
        WorldMap earth = new WorldMap(10, 10);
        earth.plot(new Point(1,1, new Location("old shed")));
        earth.plot(new Point(2,0, new Location("drained swimming pool")));
        earth.plot(new Point(3,5, new Location("crop circle")));
        earth.plot(new Point(7,5, new Location("rundown factory")));

        // plot co-ordinates for locations on the moon
        WorldMap moon = new WorldMap(5, 5);
        moon.plot(new Point(1,2, new Location("moon landing site")));
        moon.plot(new Point(3,5, new Location("giant crater")));

        WorldMap titan = new WorldMap(5, 5);
        WorldMap marz = new WorldMap(5, 5);
        WorldMap europa = new WorldMap(5, 5);


        milkyWay.addPlanet(new Planet("earth", 5.55, 234213422, earth));
        milkyWay.addPlanet(new Planet("moon", 1.24, 1, moon));
        milkyWay.addPlanet(new Planet("mars", 5.55, 0, marz));
        milkyWay.addPlanet(new Planet("titan", 1.24, 0, titan));
        milkyWay.addPlanet(new Planet("europa", 1.24, 0, europa));





        HUD.titleScreen();
        System.out.println("You are an: " + alien.race + " named: " + alien.name + ".");
        System.out.println("You've been selected by your race to do the annual survey of the milky way \nand to monitor the progress of mankind.");
        milkyWay.getPlanets();
        System.out.println("Please Select a planet."); //loop through galaxy planets

        Scanner console = new Scanner(System.in);
        String planet = console.next();

        if (planet.toUpperCase().equals("EARTH")) {
            System.out.println("You land on mother earth");
            System.out.println("this planets grid is " + earth.getW() + " by " + earth.getH() + ",");
            System.out.println("Contains 1 encounter(5, 5) and " + earth.locations.size() + " locations.");
            while (console.hasNextLine()) {
                // get i/o, do stuff.
                System.out.println("move: 'N', 'E', 'S', 'W'");
                String input = console.next();
                HUD.update(input);

                // move Creature by x or y on planet z
                Creature.move(saucer.driver, input, earth); // static meth
                Creature.checkEncounter(saucer.driver, tractor.driver);
                saucer.drainPetrol(1);
                earth.getLocation(saucer.driver);

                HUD.vehicleInfo(saucer);
            }

        } else if (planet.toUpperCase().equals("MOON")) {
            System.out.println("You land on the moon in zero G");
            System.out.println("this planets grid is " + moon.getW() + " by " + moon.getH() + ",");
            System.out.println("Contains 1 encounter(3, 4) and " + moon.locations.size() + " locations.");
            while (console.hasNextLine()) {
                // get i/o, do stuff.
                System.out.println("move: 'N', 'E', 'S', 'W'");
                String input = console.next();
                HUD.update(input);

                // move Creature by x or y on planet z
                Creature.move(saucer.driver, input, moon); // static meth
                Creature.checkEncounter(saucer.driver, buggy.driver);
                saucer.drainPetrol(1);
                moon.getLocation(saucer.driver);

                HUD.vehicleInfo(saucer);
            }
        } else {
            System.out.println("You can only currently visit 'earth' and 'moon' in this demo.");
            }

    }





    private void test(){

    }

}
