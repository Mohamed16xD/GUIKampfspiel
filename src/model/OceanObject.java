package model;

public abstract class OceanObject {

    private String name;

    protected int fightPowerAbove;
    protected int fightPowerBelow;
    protected int defense;
    protected int level;

    public OceanObject(String n){
        name = n;
    }

    public String getName() {
        return name;
    }

    public int getDefense() {
        return defense;
    }

    public int getLevel() {
        return level;
    }

    public abstract int getFightPower();
}
