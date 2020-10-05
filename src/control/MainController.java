package control;
import model.*;
import view.MainView;

public class MainController {

    private Watercraft player;
    public OceanMonster monster;

    public MainController() {

    }

    public void createNewWaterCraft(String name, boolean boat) {
        if (boat == true) {

            player = new Boat(name);

        } else {

            player = new Submarine(name);

        }

    }


    public String[] getWatercraftInfos() {
        String[] s = new String[6];

        s[0] = player.getName();
        s[1] = String.valueOf(player.getFightPower());
        s[2] = String.valueOf(player.getFleePower());
        s[3] = String.valueOf(player.getDefense());
        s[4] = String.valueOf(player.getCurrentXP());
        s[5] = String.valueOf(player.getLevel());

        return s;
    }

    public String createNewMonster(int level) {

        int random = (int) (Math.random());

        return null;
    }

    public String[] getMonsterInfos() {

        return null;

    }

        public String fight () {
            if (monster.getFightPower() < player.getFightPower()) {
                player.gainXP(monster.getFightPower());
                return "Du hast gewonnen!" + createNewMonster(player.getLevel());
            }
            return "Du hast verloren!";
        }




    public String flee(){

        return null;

    }

}
