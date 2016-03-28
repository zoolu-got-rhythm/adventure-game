package model.life;

import model.Item;

import java.util.Vector;

/**
 * Created by C1575287 on 27/03/2016.
 */
public class Inventory {
    Vector<Item> backpack = new Vector<>();

    public Inventory(){

    }

    public void addItem(Item x){
        backpack.addElement(x);
    }
}
