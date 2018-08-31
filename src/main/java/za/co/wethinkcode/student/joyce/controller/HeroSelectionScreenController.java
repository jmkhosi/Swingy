package za.co.wethinkcode.student.joyce.controller;

import za.co.wethinkcode.student.joyce.model.characters.Warrior;
import za.co.wethinkcode.student.joyce.view.HeroSelectionScreenPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HeroSelectionScreenController {

    HeroSelectionScreenPanel heroSelectionScreenPanel;
    GUIController guiController;
    String heroSelected;

    public HeroSelectionScreenController(GUIController guiController, HeroSelectionScreenPanel heroSelectionScreenPanel) {

        this.heroSelectionScreenPanel = heroSelectionScreenPanel;
        this.guiController = guiController;
        heroSelectionScreenPanel.addPrevHeroActionListener(btnPreviousScreenListener);
        heroSelectionScreenPanel.addStartGameActionListener(btnStartGameListener);
        heroSelectionScreenPanel.addComboBoxListener(addComboBoxListener);

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

    ActionListener addComboBoxListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JComboBox comboBox = (JComboBox) e.getSource();
            heroSelected = (String) comboBox.getSelectedItem();
            System.out.println(heroSelected);

          int index = 0;

            if (heroSelected == ){

            }
        }
    };
}
