package view;

import view.MainView;
import control.MainController;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FightPanelHandler {
    private JPanel panel;
    private JTextArea fightInfo;
    private JButton fightButton;
    private JButton fleeButton;
    private JLabel monsterName;
    private JLabel monsterLevel;
    private JLabel monsterPower;
    private JLabel monsterHealth;
    private JLabel playerName;
    private JLabel playerLevel;
    private JLabel playerPower;
    private JLabel playerHealth;
    private JButton backToAdventure;
    private MainView mainView;
    private MainController mainController;
    private int a;



    public FightPanelHandler(MainController mainController, MainView mainView) {
        createButtons();
        this.mainController = mainController;
        this.mainView = mainView;
        updateGUI();

    }

    public JPanel getPanel(){
        return panel;
    }

    private void createButtons(){
        fightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fight();
            }
        });
        fleeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                flee();
            }
        });
        backToAdventure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //TODO Reaktion auf Kampfende implementieren
            }
        });
    }

    private void createEnemy(){ //zufällige Gegnerart
        Math.random();
        if(Math.random()<0.5){
            monsterName.setText("Mammal");
            monsterHealth.setText("100");
            monsterLevel.setText("1");
        }

        if(Math.random()>=0.5){
            monsterName.setText("Fish");
            monsterHealth.setText("100");
            monsterLevel.setText("1");

        }

    }

    private void fight(){
        //playerFightPowerAbove - monsterHealth;
        //playerFightPowerBelow - monsterHealth;
    }

    private void flee(){
        updateGUI();
    }

    private void updateGUI(){
        //TODO Statistiken darstellen, falls noch keine der Lebenspunkte auf 0 gesunken ist.
        //TODO Falls Lebenspunkte bei Monster oder Spieler auf 0, dann muss die Methode endPanel() aufgerufen werden.
        endPanel();
        createEnemy();
    }

    private boolean isBoat(){
        return true;     //TODO Bestimmen, ob man ein Boat oder ein Submarine ist, um so die Angriffskräfte von Mammal & Fish zu bestimmen
    }

    private void takeDamage(){
        updateGUI();     //TODO Hier ist es wichtig zu wissen, ob man ein Boat oder ein Submarine ist, und gegen welche Gegnerart man kämpft.
    }

    private void startPanel(){
        fightButton.setEnabled(true);
        fleeButton.setEnabled(true);
        backToAdventure.setVisible(false);
    }

    private void endPanel(){
        fightButton.setEnabled(false);
        fleeButton.setEnabled(false);
        backToAdventure.setVisible(true);
        //TODO Irgendwie muss die Information, wie das Kampf ausgegangen ist, verwertet werden. Diese Information entscheiet darüber, wie der backToAdventure-Button reagiert.
    }
}
