package model;

import control.MainController;
import javafx.scene.paint.Stop;

public abstract class Watercraft extends OceanObject {

    private int currentXP;
    protected int fleePower;

    public Watercraft(String n){
        super(n);
        currentXP = 0;
        fleePower = 2;
        level = 1;
    }
    public int getCurrentXP(){
       return currentXP;

    }

    public int getFleePower() {
        return fleePower;
    }

    public void gainXP(int amount){
        currentXP = amount + currentXP;
        if (currentXP > 5){
            gainLevel();
        }
        //TODO Weitere XP-Grenzen hinzufügen und darauf achten, dass man nicht zu schnell in der Erfahrung steigt.
    }

    public abstract void gainLevel();

}
