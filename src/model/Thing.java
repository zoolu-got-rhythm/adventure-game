package model;

import model.journey.Point;
import model.life.Creature;

/**
 * Created by C1575287 on 25/03/2016.
 */
public class Thing {

    String name;

    public Thing(){

    }

    public Item fetchThing(){
        int dice = (int) Math.floor(Math.random() * 5);

        switch(dice){
            case 1: return new Item("grenade", 20);
            case 2: return new Item("gallon of petrol", 2);
            case 3: return new Item("sheep", 0);
            case 4: return new Item("cow", 0);
            default: return new Item("potion", 15);
        }
    }

    public static void main(String[] args){
        Thing test = new Thing();
        test.fetchThing();
    }
}
