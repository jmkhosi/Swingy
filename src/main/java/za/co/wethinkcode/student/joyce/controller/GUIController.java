package za.co.wethinkcode.student.joyce.controller;

import za.co.wethinkcode.student.joyce.view.*;

import javax.swing.*;

public class GUIController {

    GUIView guiView;

    public void startGame() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                guiView = new GUIView();
                showHomeScreen();
            }
        });
    }

    public void showGameArena(){

        GameArenaScreenPanel gameArenaScreenPanel = new GameArenaScreenPanel();
        GameArenaScreenController gameArenaScreenController = new GameArenaScreenController(this, gameArenaScreenPanel);
        switchPanelInMainWindow(gameArenaScreenPanel);
    }

    public void showHeroSelection() {
        HeroSelectionScreenPanel heroSelectionScreenPanel = new HeroSelectionScreenPanel();
        HeroSelectionScreenController heroSelectionScreenController = new HeroSelectionScreenController(this, heroSelectionScreenPanel);
        switchPanelInMainWindow(heroSelectionScreenPanel);
    }

    public void loadPreviousGame() {
        ConfirmPreviousGameScreenPanel confirmPreviousGameScreenPanel = new ConfirmPreviousGameScreenPanel();
        switchPanelInMainWindow(confirmPreviousGameScreenPanel);
    }

//    public void showPrevHomeScreen() {
//
//        HomeScreenPanel homeScreenPanel = new HomeScreenPanel();
//        HomeScreenController homeScreenController = new HomeScreenController(this, homeScreenPanel);
//        switchPanelInMainWindow(homeScreenPanel);
//    }

    public void showHomeScreen() {
        HomeScreenPanel homeScreenPanel = new HomeScreenPanel();
        HomeScreenController homeScreenController = new HomeScreenController(this, homeScreenPanel);
        switchPanelInMainWindow(homeScreenPanel);
    }

    private void switchPanelInMainWindow(JPanel panel) {
        guiView.switchPanel(panel);
    }
}
