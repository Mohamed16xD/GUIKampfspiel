package model;

public abstract class OceanMonster extends OceanObject{
    /**
     * Ein Objekt der Klasse OceanMonster wird erstellt.
     * Die Variablen followPowerAbove und followPowerBelow werden deklariert.
     * Der Parameter n wird weitergereicht.
     */

    protected int followPowerAbove;
    protected int followPowerBelow;

    public OceanMonster(String n){
        super(n);
    }

    /**
     * Die followPower wird berechnet indem, falls der Spieler ein Boat ist, die
     * followPowerBelow mit dem Zweifachen der followPowerAbove addiert und zurückgegeben wird
     * oder, falls der Spieler ein Submarine ist die followPowerAbove mit dem Zweifachen
     * der followPowerBelow addiert und zurückgegeben wird.
     * @param isBoat
     * @return
     */
    public int getFollowPower(Boolean isBoat){
        if(isBoat == true){
            return followPowerBelow+2*followPowerAbove;
        }else{
            return followPowerAbove+2*followPowerBelow;
        }
    }
}
