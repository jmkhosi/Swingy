package za.co.wethinkcode.student.joyce.controller;

import za.co.wethinkcode.student.joyce.model.Game;
import za.co.wethinkcode.student.joyce.model.characters.Hero;
import za.co.wethinkcode.student.joyce.view.*;

import javax.swing.*;

public class GUIController {

    public Game game;

    GUIView guiView;

    public GUIController(Game game) {
       this.game = game;

    }


    public void startGame() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                guiView = new GUIView();
                showHomeScreen();
            }
        });
    }

    /*public void ExitGame(){

        //GUIView gview = new GUIView();
        GameArenaScreenPanel gameArenaScreenPanel = new GameArenaScreenPanel(game);
        ExitGameController egame = new ExitGameController(this, gameArenaScreenPanel);

        System.exit(0);
    }*/

    public void showGameArena(Hero hero){

        GameArenaScreenPanel gameArenaScreenPanel = new GameArenaScreenPanel(game, hero);
        game.hero = hero;
        GameArenaScreenController gameArenaScreenController = new GameArenaScreenController(this, gameArenaScreenPanel, game);
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


