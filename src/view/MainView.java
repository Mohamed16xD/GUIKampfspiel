package view;

import control.MainController;

import javax.swing.*;

public class MainView extends JFrame {

    // Attribute

    // Referenzen
    private MainController mainController;
    private JPanel startPanel, fightPanel, adventurePanel;

    /**
     * Konstruktor
     *
     * @param mainController Ein Referenz auf ein Controller-Objekt.
     */
    public MainView(MainController mainController) {

        this.mainController = mainController;
        this.startPanel = new StartPanelHandler(this).getPanel();
        this.fightPanel = new FightPanelHandler(mainController, this).getPanel();
        this.adventurePanel = new AdventurePanelHandler(this).getPanel();

        this.getContentPane().add(startPanel);

        this.setLocation(50, 50);
        this.setSize(1000, 750);
        this.setResizable(false);
        this.setTitle("Quit-Game-Template");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void startGame(String name, boolean isSubmarine) {
        //mainController.createPlayer(name, isSubmarine);


        this.getContentPane().removeAll();
        this.getContentPane().invalidate();

        this.getContentPane().add(fightPanel); //fightPanel wird aufgerufen
        this.getContentPane().revalidate();
    }


    public void end (){

    }

}

