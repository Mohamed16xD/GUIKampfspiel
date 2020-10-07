package model;

public class Submarine extends Watercraft{
    /**
     * Ein Objekt der Klasse Submarine wird erzeugt
     *  und übergibt an den Konstruktor der Oberklasse den Parameter name weiter.
     *  fightPowerAbove bekommt den Wert 1, fightPowerBelow bekommt den Wert 3 und defence bekommt den Wert 2.
     * @param name
     */
    public Submarine(String name){
        super(name);
         fightPowerAbove = 1;
         fightPowerBelow = 3;
         defense = 2;
    }
    public int getFightPower() {
        return fightPowerAbove + 2 * fightPowerBelow;
    }
    /**
     * fightPowerBelow steigt um 2 Punkte, fightPowerAbove steigt um 1 Punkt, defence steigt um 2 Punkte,
     * fleePower steigt um 2 Punkte und level steigt um 1 Punkt.
     */
    public void gainLevel(){
         fightPowerBelow = fightPowerBelow + 2;
        fightPowerAbove++;
        defense = defense + 2;
        fleePower = fleePower + 2;
        level++;
    }
}
