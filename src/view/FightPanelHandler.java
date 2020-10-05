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

    private void fight(){
        //TODO Entsprechende Methode vom MainController aufrufen und Ergebnisse in der GUi darstellen. Anschließend die Stats der Kämfper in der GUI aktualisieren.
        updateGUI();
    }

    private void flee(){
        //TODO Entsprechende Methode vom MainController aufrufen und Ergebnisse in der GUi darstellen. Anschließend die Stats der Kämfper in der GUI aktualisieren.
        updateGUI();
    }

    private void updateGUI(){
        //TODO Statistiken darstellen aktualisieren.
        String[] monsterStats = mainController.getMonsterInfos();
        monsterName.setText(monsterStats[0]);
        String[] playerStats = mainController.getWatercraftInfos();
        playerName.setText(playerStats[0]);


        //TODO Falls Lebenspunkte bei Monster oder Spieler auf 0, dann muss die Methode endPanel() aufgerufen werden.
        endPanel();
    }

    /**
     * Methode wird beim Starten eines Kampfes aufgerufen.
     * Die Knöpfe erhalten den passenden Zustand, die Labels werden aktualisiert.
     */
    private void startPanel(){
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
        //TODO Irgendwie muss die Information, wie das Kampf ausgegangen ist, verwertet werden. Diese Information entscheiet darüber, wie der backToAdventure-Button reagiert.
    }
}
