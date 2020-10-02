package model;

public abstract class Mammal extends OceanMonster{
    public Mammal(String name, int level ) {
        super(name);
        int random = (int) (Math.random() * 2 + (level - 1));
        fightPowerAbove = 1 * random;
        random = (int) (Math.random() * 2 + (level - 1));
        fightPowerBelow = 2 * random;
        random = (int) (Math.random() * 2 + (level - 1));
        defense = (int) 1.5 * random;
        random = (int) (Math.random() * 2 + (level - 1));
        followPowerAbove = (int) 0.5 * random;
        random = (int) (Math.random() * 2 + (level - 1));
        followPowerBelow = (int) 1.5 * random;
    }
    public int getFightPower(Boolean isBoat){
        if(isBoat == true){
            return fightPowerAbove;
        }else{
            return fightPowerBelow*2;
        }
    }

}


