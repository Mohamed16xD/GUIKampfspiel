package model;
abstract class OceanMonster extends OceanObject{

    protected int followPowerAbove;
    protected int followPowerBelow;

    public OceanMonster(String n){
        super(n);
    }

    public int getFollowPower(Boolean isBoat){
        if(isBoat == true){
            return followPowerBelow+2*followPowerAbove;
        }else{
            return followPowerAbove+2*followPowerBelow;
        }
    }
}
