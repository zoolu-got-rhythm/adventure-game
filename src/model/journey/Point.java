package model.journey;

import model.Location;
import model.WorldMap;
import model.life.Creature;

/**
 * Created by C1575287 on 07/03/2016.
 */
public class Point {

    int x;
    int y;
    Location place;


    public Point(int x, int y, Location place){
        this.x = x;
        this.y = y;
        this.place = place;
    }

    // overload
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Location getPlace(){ return place; }

    public void moveN() {
        this.x -= 1;
    }

    public void moveE() {
        this.y += 1;
    }

    public void moveS() {
        this.x += 1;
    }

    public void moveW() {
        this.y -= 1;
    }

    // logic to check if point is out of bounds.
    public void isOutOfBounds(WorldMap map){
        if(getX() == -1){
            setX(0);
        } else if(getY() == -1){
            setY(0);
        } else if(getX() == map.getW() + 1){
            this.x -= 1;
        } else if(getY() == map.getH() + 1){
            this.y -= 1;
        } else{
            System.out.println("you are in bounds.");
        }
    }

    public String currentPosition(){
        return this.getX() + ", " + this.getY();
    };
}
