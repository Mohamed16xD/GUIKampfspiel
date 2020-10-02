package model;

    public class Boat extends Watercraft{
        public Boat(String name){
            super(name);
            fightPowerAbove = 3;
            fightPowerBelow = 1;
            defense = 2;
        }

        public int getFightPower(){
            return 2*fightPowerAbove + fightPowerBelow;
        }

        public void gainLevel(){
            fightPowerAbove = fightPowerAbove + 2;
            fightPowerBelow++;
            defense = defense + 2;
            fleePower = fleePower + 2;
            level++;
        }


}
