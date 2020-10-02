package model;

public class Submarine extends Watercraft{
    public Submarine(String name){
        super(name);
        fightPowerAbove = 1;
        fightPowerBelow = 3;
        defense = 2;
    }
    public int getFightPower() {
        return fightPowerAbove + 2 * fightPowerBelow;
    }
    public void gainLevel(){
        fightPowerBelow = fightPowerBelow + 2;
        fightPowerAbove++;
        defense = defense + 2;
        fleePower = fleePower + 2;
        level++;
    }
}
