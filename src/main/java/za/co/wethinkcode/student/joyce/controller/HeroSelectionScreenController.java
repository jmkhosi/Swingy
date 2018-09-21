package za.co.wethinkcode.student.joyce.controller;


import za.co.wethinkcode.student.joyce.model.characters.Elf;
import za.co.wethinkcode.student.joyce.model.characters.Hero;
import za.co.wethinkcode.student.joyce.model.characters.Knight;
import za.co.wethinkcode.student.joyce.model.characters.Warrior;
import za.co.wethinkcode.student.joyce.view.HeroSelectionScreenPanel;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HeroSelectionScreenController {

    HeroSelectionScreenPanel heroSelectionScreenPanel;
    GUIController guiController;
    String heroSelected;
    String heroname = "";
    Hero hero;


    public HeroSelectionScreenController(GUIController guiController, HeroSelectionScreenPanel heroSelectionScreenPanel) {

        this.heroSelectionScreenPanel = heroSelectionScreenPanel;
        this.guiController = guiController;
        heroSelectionScreenPanel.addPrevHeroActionListener(btnPreviousScreenListener);
        heroSelectionScreenPanel.addStartGameActionListener(btnStartGameListener);
        heroSelectionScreenPanel.addComboBoxListener(addComboBoxListener);
        heroSelectionScreenPanel.addtextFieldListener(textFieldListener);


    }

    ActionListener btnStartGameListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(heroname);
            hero.name = heroname;
            guiController.showGameArena(hero);

        }
    };

    DocumentListener textFieldListener = new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            try {
                heroname = (e.getDocument().getText(0, e.getDocument().getLength()));
            } catch (BadLocationException e1) {
                e1.printStackTrace();
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            try {
                heroname = (e.getDocument().getText(0, e.getDocument().getLength()));
            } catch (BadLocationException e1) {
                e1.printStackTrace();
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            try {
                heroname = (e.getDocument().getText(0, e.getDocument().getLength()));
            } catch (BadLocationException e1) {
                e1.printStackTrace();
            }
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

            if (heroSelected.equals("Warrior")) {
                hero = new Warrior("");
                heroSelectionScreenPanel.setHeroStatisticsText(hero);


            }else if(heroSelected.equals("Knight")){
                hero = new Knight("");
                heroSelectionScreenPanel.setHeroStatisticsText(hero);
            }else if(heroSelected.equals("Elf")){

                 hero = new Elf("");
                heroSelectionScreenPanel.setHeroStatisticsText(hero);
            }
                return;
        }
    };
}