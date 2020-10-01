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

            }
        });
    }

    private void fight(){
        updateGUI();
    }

    private void flee(){
        updateGUI();
    }

    private void updateGUI(){
        endPanel();
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
    }
}
