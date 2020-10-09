package model;

public abstract class Watercraft extends OceanObject {

    private int currentXP;
    protected int fleePower;

    /**
     * Ein Objekt der Klasse Watercraft wird erzeugt,indem der Konstruktor der Oberklasse OcaenObjekt
     * aufgerufen und der übergebene Parameter n weitergereicht wird.
     * currentXP bekommt den Wert 0, fleePower bekommt den Wert 2 und level bekommt den Wert 1.
     * @param n
     */
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

    /**
     *currentXP wird mit amount addiert.
     * Solange currentXP nicht den Wert 100 überschreitet wird die abstrackte Methode gainLevel() aufgerufen.
     * Außerdem wird currentXP mit 1 multipliziert und durch 10 geteilt.
     * @param amount
     */
    public void gainXP(int amount){
        currentXP = amount + currentXP;
        if (currentXP < 100) {
            currentXP = 1*currentXP/10;
            gainLevel();

        }






    }

    public abstract void gainLevel();

}
