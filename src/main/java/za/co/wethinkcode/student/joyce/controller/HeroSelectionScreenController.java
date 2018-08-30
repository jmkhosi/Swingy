package za.co.wethinkcode.student.joyce.controller;

import za.co.wethinkcode.student.joyce.view.HeroSelectionScreenPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HeroSelectionScreenController {

    HeroSelectionScreenPanel heroSelectionScreenPanel;
    GUIController guiController;

    public HeroSelectionScreenController(GUIController guiController, HeroSelectionScreenPanel heroSelectionScreenPanel) {

        this.heroSelectionScreenPanel = heroSelectionScreenPanel;
        this.guiController = guiController;
        heroSelectionScreenPanel.addPrevHeroActionListener(btnPreviousScreenListener);
        heroSelectionScreenPanel.addStartGameActionListener(btnStartGameListener);


    }

    ActionListener btnStartGameListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            guiController.showGameArena();
        }
    };

    ActionListener btnPreviousScreenListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            guiController.showHomeScreen();
        }
    };
}
