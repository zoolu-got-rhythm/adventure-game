package model.life;

/**
 * Created by C1575287 on 07/03/2016.
 */
public class Organism {

    String race = "unknown";
    int lifespan = 50;
    int hp = 100;


    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Organism(){

    }
}
