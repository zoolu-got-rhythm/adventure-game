package model.life;

import model.Item;
import model.WorldMap;
import model.journey.Point;

import java.util.Scanner;

/**
 * Created by C1575287 on 07/03/2016.
 */
public class Creature extends Organism{

    public String name;
    // track players current position and moveIt() by 1 on x, y on an imaginary grid.
    public Point pos;
    public Inventory inventory;

    public Creature(String name, String race, Point origin){
        super(race);
        // this.setRace(race);  // default race is "unknown"
        this.name = name;
        this.pos = origin;
        this.inventory = new Inventory();

    }


    public static void move(Creature creature, String dir, WorldMap map){
        // switch: if == "n" this.pos.y + 1, "s" == this.pos.y- 1
        // default: if no location match then print "nothing but land, keep exploring";

        switch(dir.toUpperCase()){
            case "N": creature.pos.moveN(); // set y
                      break;
            case "E": creature.pos.moveE(); // set y
                      break;
            case "S": creature.pos.moveS(); // set y
                      break;
            case "W": creature.pos.moveW(); // set y
                      break;
            default:  System.out.println("insert a direction dummy");
        }

        creature.pos.isOutOfBounds(map);

        System.out.println(creature.name + "'s position is: " + creature.pos.currentPosition());
        System.out.println("");
    }

    public static void checkEncounter(Creature one, Creature two){
        if(one.pos.getX() == two.pos.getX() && one.pos.getY() == two.pos.getY()){
            System.out.println("you encounter: " + two.name);
            fight(one, two);
        }
    }

    private static void fight(Creature one, Creature two){
        // fight logic
        System.out.println("Battle: 'hit', 'item', 'flea'");
        Scanner console = new Scanner(System.in);
        String move = console.next();
        switch(move.toUpperCase()){
            case "HIT": hit(two);
                        hit(one);
                        break;
            case "ITEM": useItem(one, two);
                         break;
            case "FLEA": if(flea()) {
                             return;
                         }else{
                             hit(one);
                             break;
                         }
            default: System.out.println("Type in a command.");
                     break;
        }

        // check for death, otherwise recursively fight again.
        if(one.hp <= 0){
            System.out.println(one.name + " dies..");
            gameover(one);
        }else if(two.hp <= 0){
            System.out.println(two.name + " dies..");
            two = null; // change reference to object so there is no memory location
            return;
        }else{
            fight(one, two);
        }
    }

    private static void hit(Creature c){
        int currentHp = c.getHp();
        int damage = (int) Math.round(Math.random() * 25);
        c.setHp(currentHp - damage);
        System.out.println(c.name + " takes " + damage + " damage.");
        System.out.println(c.name + "'s current hp is " + c.getHp());
    }

    // overload for custom damage
    private static void hit(Creature c, int damage){
        int currentHp = c.getHp();
        c.setHp(currentHp - damage);
        System.out.println(c.name + " takes " + damage + " damage.");
        System.out.println(c.name + "'s current hp is " + c.getHp());
    }

    private static void useItem(Creature c, Creature c2){
        myItems(c);
        System.out.println("Choose an available item or go 'back'.");
        Scanner console = new Scanner(System.in);
        String itemName = console.next();
        switch(itemName.toUpperCase()) {
            case "GRENADE":
                if (itemStock(c, "GRENADE")) {
                    hit(c2, 25); // use this for other items too.
                    hit(c);
                    removeItem(c, "GRENADE");
                    break;
                } else {
                    System.out.println("you don't have any grenades.");
                    break;
                }
            case "SHEEP":
                if (itemStock(c, "SHEEP")) {
                    hit(c2, 5); // use this for other items too.
                    hit(c);
                    removeItem(c, "SHEEP");
                    break;
                } else {
                    System.out.println("you don't have any sheep.");
                    break;
                }
            case "COW":
                if (itemStock(c, "COW")) {
                    hit(c2, 5); // use this for other items too.
                    hit(c);
                    removeItem(c, "COW");
                    break;
                } else {
                    System.out.println("you don't have any cows.");
                    break;
                }
            case "GALLON OF PETROL":
                if (itemStock(c, "GALLON OF PETROL")) {
                    hit(c2, 0); // use this for other items too.
                    hit(c);
                    removeItem(c, "GALLON OF PETROL");
                    break;
                } else {
                    System.out.println("you don't have any petrol.");
                    break;
                }
            case "POTION":
                if (itemStock(c, "POTION")) {
                    heal(c, 15); // use this for other items too.
                    removeItem(c, "POTION");
                    break;
                } else {
                    System.out.println("you don't have any potions.");
                    break;
                }

            case "BACK": break;
            default:
                System.out.println("that item doesn't exist");
                useItem(c, c2);

        }
    }

    private static void heal(Creature c, int boost){
        int currentHp = c.getHp();
        c.setHp(currentHp + boost);
        System.out.println(c.name + " heals for " + boost + " hp.");
        System.out.println(c.name + "'s current hp is " + c.getHp());
    }

    private static Boolean itemStock(Creature c, String item){
        for (int i = 0; i < c.inventory.backpack.size(); i++) {
          if(c.inventory.backpack.get(i).name.toUpperCase().equals(item)){
              return true;
          }
        }
        return false;
    }

    private static void removeItem(Creature c, String item){
        for (int i = 0; i < c.inventory.backpack.size(); i++) {
            if(c.inventory.backpack.get(i).name.toUpperCase().equals(item)){
                c.inventory.backpack.remove(i);
                return;
            }
        }
    }

    private static void myItems(Creature c){

        String backpack = "Available items are: ";
        for (int i = 0; i < c.inventory.backpack.size(); i++) {
            if (i < c.inventory.backpack.size() - 2) {
                backpack += c.inventory.backpack.get(i).name + ", ";
            } else if (i < c.inventory.backpack.size() - 1) {
                backpack += c.inventory.backpack.get(i).name + ", ";
            } else {
                backpack += c.inventory.backpack.get(i).name + ".";
            }
        }

        System.out.println(backpack);
    }

    private static Boolean flea(){
        System.out.println("you try to escape...");
        int dice = (int) Math.round(Math.random() * 3);
        if(dice == 3){
            System.out.println("you are successful");
            return true;
        }else{
            System.out.println("you are unsuccessful");
            return false;
        }
    }

    private static void gameover(Creature c){
        System.out.println("the news of " + c.name + "'s death will not go down lightly. \n" +
                           "que war of the worlds like invasion, roll that camera Steven.");
        System.exit(0);
    }

    public void loot(Creature c, Item item){
         c.inventory.addItem(item);
    }
}
