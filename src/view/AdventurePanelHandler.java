package view;

import javax.swing.*;
import control.MainController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdventurePanelHandler {
    private JPanel panel;
    private JLabel adventurePanel;
    private JButton buttonNorth;
    private JButton buttonSouth;
    private JButton buttonWest;
    private JButton buttonEast;
    private MainView mainView;

    public AdventurePanelHandler(MainView mainView) {
        createButtons();
        this.mainView = mainView;
    }

    public JPanel getPanel(){
        return panel;
    }

    private void createButtons(){
        buttonNorth.setText("Norden");
        buttonSouth.setText("Süden");
        buttonWest.setText("Westen");
        buttonEast.setText("Osten");

        buttonNorth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        buttonSouth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        buttonWest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        buttonEast.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }
}
