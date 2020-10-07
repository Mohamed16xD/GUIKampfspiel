package model;

public abstract class OceanObject {

    private String name;

    protected int fightPowerAbove;
    protected int fightPowerBelow;
    protected int defense;
    protected int level;

    /**
     * Der Parameter n wird von der Klasse Watercraft entnommen und name bekommt den Parameter n zugeschrieben.
     * @param n
     */
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
