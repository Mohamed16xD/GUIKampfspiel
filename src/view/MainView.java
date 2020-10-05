package view;

import control.MainController;

import javax.swing.*;

public class MainView extends JFrame {

    // Attribute

    // Referenzen
    private MainController mainController;
    private JPanel startPanel, fightPanel, adventurePanel;
    private FightPanelHandler fightPanelHandler;

    /**
     * Konstruktor
     *
     * @param mainController Ein Referenz auf ein Controller-Objekt.
     */
    public MainView(MainController mainController) {

        this.mainController = mainController;
        this.startPanel = new StartPanelHandler(this).getPanel();
        this.fightPanelHandler = new FightPanelHandler(mainController, this);
        this.fightPanel = fightPanelHandler.getPanel();
        this.adventurePanel = new AdventurePanelHandler(this).getPanel();


        this.getContentPane().add(startPanel);

        this.setLocation(50, 50);
        this.setSize(1000, 750);
        this.setResizable(false);
        this.setTitle("Ocean Adventure");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public void startGame(String name, boolean isSubmarine) {
        mainController.createNewWaterCraft(name, !isSubmarine);
        mainController.createNewMonster(1);

        this.getContentPane().removeAll();
        this.getContentPane().invalidate();

        fightPanelHandler.startPanel();

        this.getContentPane().add(fightPanel);
        this.getContentPane().revalidate();
    }


    public boolean canFlee(){
        return true;
    }


    public void end (){

    }

}

