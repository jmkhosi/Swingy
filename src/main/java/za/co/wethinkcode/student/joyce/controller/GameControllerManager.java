package za.co.wethinkcode.student.joyce.controller;

import za.co.wethinkcode.student.joyce.InterfaceType;

public class GameControllerManager {
    public void initGame(InterfaceType interfaceType) {
        if (interfaceType == InterfaceType.GUI) {
            GUIController controller = new GUIController();
            controller.startGame();
        }
    }
}
