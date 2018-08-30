package za.co.wethinkcode.student.joyce;

import za.co.wethinkcode.student.joyce.controller.GameControllerManager;
import za.co.wethinkcode.student.joyce.view.GridSquareComponent;

public class main {

    static GridSquareComponent gsc;

    public static void main(String[] args) {

        GameControllerManager gameManager = new GameControllerManager();
        InterfaceType interfaceType = getInterfaceType(args);
        gameManager.initGame(interfaceType);
        gsc = new GridSquareComponent();
    }

    private static InterfaceType getInterfaceType(String[] args) {
        //Write Logic to get the interface type
        return InterfaceType.GUI;
    }

}
