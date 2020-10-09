package control;
import model.*;
import view.MainView;

public class MainController {
    /**
     * 2 Referenzen werden erstellt: Player und Monster
     */
    private Watercraft player;
    public OceanMonster monster;

    public MainController() {



    }

    /** Wenn Boat ausgewählt wurde dann wird ein Boat Objekt erstellt ansonsten ein Submarine ( unter der Referenz Player)
     */
    public void createNewWaterCraft(String name, boolean boat) {
        if (boat == true) {
            player = new Boat(name);
        } else {
            player = new Submarine(name);
        }
    }

    /** Eine Methode um Werte von Player aufzurufen
     */
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

    /** Mit der Math random Methode wird entschieden ob es ein Fish oder Mammal wird gegen dem man kämpfen oder fliehen wird. unter 0,5 wird es ein Fish
     * ansonsten ein Mammal
     */
    public String createNewMonster(int level) {
        double random = Math.random();
        if(random < 0.5){
            monster = new Fish("Blub",player.getLevel());
        }else{
            monster = new Mammal("Delphine", player.getLevel());
        }

        return "Ein neues Monster... Kämpfe oder Fliehe!" ;
    }

    /** Eine Methode um Werte vom Monster aufzurufen
     */
    public String[] getMonsterInfos() {
        String[] m = new String[5];
        m[0] = String.valueOf(monster.getName());
        m[1] = String.valueOf(monster.getFightPower());
        m[2] = String.valueOf(monster.getFollowPower(player instanceof Watercraft));
        m[3] = String.valueOf(monster.getDefense());
        m[4] = String.valueOf(player.getLevel());
        return m;
    }

    /** Wenn der Spieler sich entscheidet zu kämpfen dann wird die Methode fight aufgerufen und es wird berechnet
     * ob die FightPower vom Player größer ist als die vom Monster damit man gewinnt ansonsten verliert man
     */
    public String fight () {
        if (monster.getFightPower() < player.getFightPower()) {
            player.gainXP(monster.getFightPower());
            return "Du hast gewonnen!" + createNewMonster(player.getLevel());
        }
        return "Du hast verloren!";
    }

    /**
     *  Wenn FleePower von Player größer ist als die FollowPower von Monster dann wird "Du bist erfolgreich geflohen ausgegeben."
     *  und der Player Level steigt um 1. Ansonsten verliert man "Du hast verloren!".
     */
    public String flee(){

        if(player.getFleePower() > monster.getFollowPower(monster instanceof OceanObject)){

           createNewMonster(player.getLevel()+1);
           return "Du bist erfolgreich geflohen. "+ createNewMonster(monster.getLevel());
        } else {
            return "Du hast verloren!";
        }
    }

}
