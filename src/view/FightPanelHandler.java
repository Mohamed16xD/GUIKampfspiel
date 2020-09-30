package view;

import control.MainController;

import javax.swing.*;

public class FightPanelHandler {
    private JPanel panel;
    private MainView mainView;
    private MainController mainController;

    public FightPanelHandler(MainController mainController, MainView mainView) {
        createButtons();
        this.mainController = mainController;
        this.mainView = mainView;
    }

    public JPanel getPanel(){
        return panel;
    }

    private void createButtons(){

    }
}
