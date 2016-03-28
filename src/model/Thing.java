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

    private void fetchThing(){
        int dice = (int) Math.floor(Math.random() * 5);

        switch(dice){
            case 1: new Creature("monster", "beast", new Point(2,2));
            case 2: new Item("petrol");
            case 3: new Item("baloon");
            case 4: new Item("sword");
            default: break;
        }
    }

    public static void main(String[] args){
        Thing test = new Thing();
        test.fetchThing();
    }
}
