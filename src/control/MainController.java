package control;


public class MainController {

    private Watercraft player;

    public MainController(){

    }

    public void createNewWaterCraft(String name, boolean boat){
        if (boat == true) {

            player = new Boat();

        }else{

            player = new Submarine();

           }

    }



    public String[] getWatercraftInfos(){
        String[] s = new String[6];

        s[0] = player.getName();
        s[1] = String.valueOf(player.getFightPower());
        s[2] = String.valueOf(player.getFleePower());
        s[3] = String.valueOf(player.getDefense());
        s[4] = String.valueOf(player.getCurrentXP());
        s[5] = String.valueOf(player.getLevel());

    }

    public String createNewMonster(int level){
        return null;
    }

    public String[] getMonsterInfos(){

        return null;

    }
    public String fight(){
        return null;

    }

    public String flee(){

        return null;

    }

}
