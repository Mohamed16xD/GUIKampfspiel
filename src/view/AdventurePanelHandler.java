package view;

import javax.swing.*;

public class AdventurePanelHandler {
    private JPanel panel;
    private MainView mainView;

    public AdventurePanelHandler(MainView mainView) {
        createButtons();
        this.mainView = mainView;
    }

    public JPanel getPanel(){
        return panel;
    }

    private void createButtons(){

    }
}
