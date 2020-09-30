package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanelHandler {
    private JPanel panel;
    private MainView mainView;

    public StartPanelHandler(MainView mainView) {
        createButtons();
        this.mainView = mainView;
    }

    public JPanel getPanel(){
        return panel;
    }

    private void createButtons(){

    }
}
