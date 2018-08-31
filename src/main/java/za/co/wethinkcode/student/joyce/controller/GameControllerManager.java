package za.co.wethinkcode.student.joyce.controller;

import za.co.wethinkcode.student.joyce.InterfaceType;
import za.co.wethinkcode.student.joyce.model.Game;

public class GameControllerManager {
    public void initGame(InterfaceType interfaceType) {

        Game games = new Game();

        if (interfaceType == InterfaceType.GUI) {
            GUIController controller = new GUIController(games);
            controller.startGame();
        }
    }
}
