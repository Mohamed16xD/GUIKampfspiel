package view;

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

    public FightPanelHandler(MainController mainController, MainView mainView) {
        createButtons();
        this.mainController = mainController;
        this.mainView = mainView;

        fightInfo.setText("Oh mein Gott, ein Monster des Ozeans! \nKämpfe, oder Fliehe!");
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

    private void fight(){
        String result = mainController.fight();
        fightInfo.setText(fightInfo.getText() + "\n");
        fightInfo.setText(fightInfo.getText() + result);
        if(result.equals("Du hast verloren!")){
            endPanel();
        }else{
            updateGUI();
        }
    }

    private void flee(){
        String result = mainController.fight();
        fightInfo.setText(fightInfo.getText() + "\n");
        fightInfo.setText(fightInfo.getText() + result);
        if(result.equals("Du hast verloren!")){
            endPanel();
        }else{
            updateGUI();
        }
    }

    private void updateGUI(){
        //TODO Überprüfen, ob die richtigen Statistiken an die richtigen Labels gesendet werden.
        String[] monsterStats = mainController.getMonsterInfos();
        monsterName.setText(monsterStats[0]);
        monsterHealth.setText(monsterStats[3]);
        monsterLevel.setText(monsterStats[4]);
        monsterPower.setText(monsterStats[1]);
        String[] playerStats = mainController.getWatercraftInfos();
        playerName.setText(playerStats[0]);
        playerHealth.setText(playerStats[3]);
        playerLevel.setText(playerStats[5]);
        playerPower.setText(playerStats[1]);
    }

    /**
     * Methode wird beim Starten eines Kampfes aufgerufen.
     * Die Knöpfe erhalten den passenden Zustand, die Labels werden aktualisiert.
     */
    public void startPanel(){
        fightButton.setEnabled(true);
        fleeButton.setEnabled(true);
        backToAdventure.setVisible(false);
        updateGUI();
    }

    /**
     * Methode wird nach dem Abschluss eines Kampfes oder eines Fluchtversuches aufgerufen.
     * Die Knöpfen erhalten den passenden Zustand, die Labels werden aktualisiert.
     */
    private void endPanel(){
        fightButton.setEnabled(false);
        fleeButton.setEnabled(false);
        backToAdventure.setVisible(true);
        updateGUI();
    }
}
