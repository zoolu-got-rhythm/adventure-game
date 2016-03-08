package view;

/**
 * Created by C1575287 on 07/03/2016.
 */
public class HUD {

    public HUD(){

    }

    public static void update(String d){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("+-------------+");
        System.out.println("|      n      |");
        System.out.println("|    w + e    |" + "  you move: " + d.toUpperCase() + "  map here");
        System.out.println("|      s      |");
        System.out.println("+-------------+");

    }

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
}
