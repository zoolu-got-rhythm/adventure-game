package view;

import model.WorldMap;
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
        System.out.println("From the imagination of Carl Sagan comes:");
        System.out.println("UFO");
        System.out.println("---");
    }

    public static void vehicleInfo(Vehicle v){
        System.out.println("your moving at " + v.speed + "MPH with " + v.fuel + " gallons of fuel left.");
        System.out.println("");
    }
}
