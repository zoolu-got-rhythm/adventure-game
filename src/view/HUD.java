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

        // re-fresh console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("+-------------+");
        System.out.println("|      n      |");
        System.out.println("|    w + e    |" + "  you move: " + d.toUpperCase() + "  map here");
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
        System.out.println("                                                                          ");
        System.out.println("           |         |                                                    ");
        System.out.println("           |         |                                                    ");
        System.out.println("           |         |                                                    ");
        System.out.println("           |         |                                                    ");
        System.out.println("           |         |                                                    ");
        System.out.println("            - _ _ _ -                                                     ");
        System.out.println("           ----------------------------------------------                 ");
        System.out.println("                                                                          ");
        System.out.println("                                                                          ");
        System.out.println("                                                                          ");
    }

    public static void vehicleInfo(Vehicle v){
        System.out.println("your moving at " + v.speed + "MPH with " + v.fuel + " gallons of fuel left.");
    }
}
