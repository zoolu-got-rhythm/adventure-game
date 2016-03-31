package view;

import model.WorldMap;
import model.life.Creature;
import model.life.Vehicle;

/**
 * Created by C1575287 on 07/03/2016.
 */
public class HUD {

    public HUD(){

    }

    public static void update(String d){
        String direction = "";
        switch(d.toUpperCase()){
            case "N": direction = "NORTH";
                      break;
            case "E": direction = "EAST";
                      break;
            case "S": direction = "SOUTH";
                      break;
            case "W": direction = "WEST";
                      break;
        }

        // re-fresh console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("+-------------+");
        System.out.println("|      n      |");
        System.out.println("|    w + e    |" + "  you move: " + direction);
        System.out.println("|      s      |");
        System.out.println("+-------------+");

    }

//    public static void constructMap(WorldMap map){
//        String drawMap;
//
//        String x = "";
//        if(point == loop){
//            x = pos;
//        }
//        for (int i = 0; i <= map.getH(); i++){
//            drawMap += x;
//        }
//    }

    public static void titleScreen(){
        // encapsulate this stuff into the HUD
        System.out.println("From the deceased imagination of Carl Sagan comes:");
        System.out.println("+-------+");
        System.out.println("| U.F.O |");
        System.out.println("+-------+");
    }

    public static void intro(Creature alien){
        System.out.println("You are an: " + alien.race + " named: " + alien.name + ".");
        System.out.println("You've been selected by your race to do the annual report of the milky way \nand to monitor the progress of mankind.");
        System.out.println("The elders advice: 'make sure you stock up on potions before encountering any humans, They are strong " + alien.name + "'.");
        System.out.println("");
    }

    public static void vehicleInfo(Vehicle v){
        System.out.println("your moving at " + v.speed + "MPH with " + v.fuel + " gallons of fuel left.");
    }
}
