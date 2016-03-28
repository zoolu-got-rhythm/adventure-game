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
        if(this.fuel == 0){
            System.out.println("fly back up and re-fuel");
            // return to select planets
        }else{
            this.fuel = fuel - n;
        }


       // if(this.fuel == 0) // return to galaxy, count items and select a planet.
    }
}
