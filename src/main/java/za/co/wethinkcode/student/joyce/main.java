package za.co.wethinkcode.student.joyce;

import za.co.wethinkcode.student.joyce.controller.GameControllerManager;

public class main {



    public static void main(String[] args) {

        GameControllerManager gameManager = new GameControllerManager();
        InterfaceType interfaceType = getInterfaceType(args);
        gameManager.initGame(interfaceType);


    }

    private static InterfaceType getInterfaceType(String[] args) {
        //Write Logic to get the interface type
        return InterfaceType.GUI;
    }

}
