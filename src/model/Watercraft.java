package model;

import control.MainController;

public abstract class Watercraft extends OceanObject {

    private int currentXP;
    protected int fleePower;

    public Watercraft(String n){
        super(n);
    }
    public int getCurrentXP(){
        return currentXP;
    }

    public int getFleePower() {
        return fleePower;
    }
    public void gainXP(int amount){ }

    public abstract void gainLevel();
}
