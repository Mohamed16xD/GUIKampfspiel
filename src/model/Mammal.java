package model;

public class Mammal extends OceanMonster{
    /**
     * Ein Objekt der Klasse Mammal wird erstellt
     * und übergibt an den Konstruktor der Oberklasse den Parameter name weiter.
     * Der Wert für level wird eingegeben.
     * Die Grundwerte für den Fish werden dann mit einer zufälligen Zahl zwischen
     * level -1 und level +1 multipliziert.
     * @param name
     * @param level
     */
    public Mammal(String name, int level ) {
        super(name);
        this.level = level;
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

    /**
     * Das Zweifache der Kampfkraft über Wasser und das einfache der Kampfkraft unter Wasser
     * werden addiert und das Ergebnis wird zurückgegeben.
     * @return
     */
    public int getFightPower(){
        return 2*fightPowerAbove+fightPowerBelow;
    }

}


