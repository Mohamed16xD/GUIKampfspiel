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

        double random = Math.random();
        if(random < 0.5){
            monster = new Fish("Blub",player.getLevel());
        }else{
            monster = new Mammal("Delphine", player.getLevel());
        }

        return "Ein neues Monster... Kämpfe oder Fliehe!" ;
    }

    public String[] getMonsterInfos() {
        String[] m = new String[5];
        m[0] = String.valueOf(monster.getName());
        m[1] = String.valueOf(monster.getFightPower());
        m[2] = String.valueOf(monster.getFollowPower(true));
        m[3] = String.valueOf(monster.getDefense());
        m[4] = String.valueOf(monster.getLevel());
        return m;
    }

        public String fight () {
            if (monster.getFightPower() < player.getFightPower()) {
                player.gainXP(monster.getFightPower());
                return "Du hast gewonnen!" + createNewMonster(player.getLevel());
            }
            return "Du hast verloren!";
        }




    public String flee(){
        if(player.getFleePower() > monster.getFollowPower(true)){

           createNewMonster(monster.getLevel()+1);

           return "Du bist erfolgreich geflohen"+ createNewMonster(monster.getLevel());

    }
    else {
            return "Du hast verloren!";
        }

    }

}
