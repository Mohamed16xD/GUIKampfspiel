package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanelHandler {
    private JPanel panel;
    private JTextField textField1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JLabel nameLabel;
    private JLabel submarineLabel;
    private JLabel boatLabel;
    private MainView mainView;

    public StartPanelHandler(MainView mainView) {
        createButtons();
        this.mainView = mainView;
    }

    public JPanel getPanel(){
        return panel;
    }

    private void createButtons(){
        nameLabel.setName("Name");
        submarineLabel.setName("Submarine");
        boatLabel.setName("Boat");

    }
}
