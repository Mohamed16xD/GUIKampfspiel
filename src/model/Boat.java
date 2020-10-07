package model;

    public class Boat extends Watercraft{
        /**
         * Ein Objekt der Klasse Boat wird erzeugt
         *  und übergibt an den Konstruktor der Oberklasse den Parameter name weiter.
         *  fightPowerAbove bekommt den Wert 3, fightPowerBelow bekommt den Wert 1 und defence bekommt den Wert 2.
         * @param name
         */
        public Boat(String name){
            super(name);
            fightPowerAbove = 3;
            fightPowerBelow = 1;
            defense = 2;
        }

        public int getFightPower(){
            return 2*fightPowerAbove + fightPowerBelow;
        }

        /**
         * fightPowerAbove steigt um 2 Punkte, fightPowerBelow steigt um 1 Punkt, defence steigt um 2 Punkte,
         * fleePower steigt um 2 Punkte und level steigt um 1 Punkt.
         */
        public void gainLevel(){
            fightPowerAbove = fightPowerAbove + 2;
            fightPowerBelow++;
            defense = defense + 2;
            fleePower = fleePower + 2;
            level++;
        }


}
