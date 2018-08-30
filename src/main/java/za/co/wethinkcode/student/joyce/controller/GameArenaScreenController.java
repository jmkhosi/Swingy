package za.co.wethinkcode.student.joyce.controller;

import za.co.wethinkcode.student.joyce.view.GameArenaScreenPanel;

public class GameArenaScreenController {

    GameArenaScreenPanel gameArenaScreenPanel;
    GUIController guiController;

    public GameArenaScreenController(GUIController guiController, GameArenaScreenPanel gameArenaScreenPanel) {

        this.gameArenaScreenPanel = gameArenaScreenPanel;
        this.guiController = guiController;

    }

}
