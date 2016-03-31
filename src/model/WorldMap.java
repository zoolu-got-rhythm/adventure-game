package model;

import model.journey.Point;
import model.journey.RouteLeg;
import model.life.Creature;

import java.util.Scanner;
import java.util.Vector;

/**
 * Created by C1575287 on 07/03/2016.
 */
public class WorldMap {
    public Vector<Point> locations = new Vector<Point>();
    int w;
    int h;

    public WorldMap(int width, int height){
        this.w = width;
        this.h = height;
    }

    public void plot(Point legs){
        locations.add(legs);
    }

    public void getLocation(Creature c){
        // switch statement: check current pos on point: if x and y == 0,2, locations.get(2);

        // loop through locations and check if any of their point.x and y's match with the currentPos,
        // if so run a method where you can check for their things.
        for (int i = 0; i < locations.size(); i++){
            if(c.pos.getX() == locations.get(i).getX() && c.pos.getY() == locations.get(i).getY()){
                System.out.println("you are at: " + locations.get(i).getPlace().name);
                // parse location to pick-up item method(and put in inventory)
                interact(c, i);
                return;
            }
        }
    }

    private void interact(Creature c, int index){
        System.out.println("Look: 'left', 'right', 'ahead', 'behind' or 'exit'");
        Scanner console = new Scanner(System.in);
        String look = console.next();
        Item one = locations.get(index).getPlace().n.fetchThing();
        Item two = locations.get(index).getPlace().s.fetchThing();
        Item three = locations.get(index).getPlace().e.fetchThing();
        Item four = locations.get(index).getPlace().w.fetchThing();

        switch(look.toUpperCase()){
            case "AHEAD": if(pickup(one)){
                              c.loot(c, one);
                              interact(c, index);
                          }else{
                              interact(c, index);
                          }
            case "BEHIND": if(pickup(two)){
                               c.loot(c, two);
                               interact(c, index);
                           }else{
                               interact(c, index);
                           }
            case "LEFT": if(pickup(three)){
                             c.loot(c, three);
                             interact(c, index);
                         }else{
                             interact(c, index);
                         }
            case "RIGHT": if(pickup(four)){
                              c.loot(c, four);
                              interact(c, index);
                          }else{
                              interact(c, index);
                          }
            case "EXIT": System.out.println("exiting..");
                         break;
            default: System.out.println("input not recognized.");
                     interact(c, index);
        }
    }

    private Boolean pickup(Item item){
        Scanner console = new Scanner(System.in);
        System.out.println("You find a " + item.name + ". would you like to pick this item up? y/n");
        String pickup = console.next();
        if(pickup.toUpperCase().equals("Y")){
            return true;
        }else{
            return false;
        }
    }

    private double DistanceTraveld(){
        return 0.0;
    }


    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }
}
