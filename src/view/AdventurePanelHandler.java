package view;

import javax.swing.*;

public class AdventurePanelHandler {
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
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
