package model.life;

/**
 * Created by C1575287 on 07/03/2016.
 */
public class Vehicle {

    // init
    public String name;
    public int speed;
    public Creature driver;
    public double fuel = 10;

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", fuel=" + fuel +
                ", driver=" + driver +
                '}';
    }

    public Vehicle(Creature species, String vehicle, int horsePower){
        this.driver = species;
        this.name = vehicle;
        this.speed = horsePower;
    }

    public void drainPetrol(int n){
        this.fuel = fuel - n;
    }
}
