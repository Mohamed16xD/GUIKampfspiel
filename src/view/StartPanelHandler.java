package view;


import control.MainController;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanelHandler {
    private JPanel startPanel;
    private JTextField nameField;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JLabel nameLabel;
    private JLabel submarineLabel;
    private JLabel boatLabel;
    private JButton buttonStart;
    private MainView mainView;
    private MainController mainController;
    private AdventurePanelHandler adventurePanelHandler;

    public StartPanelHandler(MainView mainView) {
        createButtons();
        this.mainView = mainView;
    }

    public JPanel getPanel(){
        return startPanel;
    }

    private void createButtons(){
        nameLabel.setText("Name");
        submarineLabel.setText("Submarine");
        boatLabel.setText("Boat");
        buttonStart.setText("Starten");


        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                start();
            }
        });
    }

    private void start(){
        mainView.startGame(nameField.getText(), radioButton1.isSelected());
    }
}

