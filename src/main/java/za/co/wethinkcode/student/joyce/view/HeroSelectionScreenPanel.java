package za.co.wethinkcode.student.joyce.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class HeroSelectionScreenPanel extends JPanel{



    JLabel label = new JLabel("   Choose Hero ");
    JTextField inputName = new JTextField("Enter Name : ",15);
    JTextArea heroStats = new JTextArea();
    private String[] heroClasses = {"Warrior", "Knight", "Fighter", "Vallian", "Orc"};
    private JLabel heroClass = new JLabel("Class:");
    private JComboBox<String> classesComboBox = new JComboBox<>(heroClasses);



    JButton startGame = new JButton("Start Game");
    JButton previousScr = new JButton("Previous Screen");




    public HeroSelectionScreenPanel() {
        setBackground(Color.LIGHT_GRAY);
        SpringLayout layout = new SpringLayout();
        setLayout(layout);
        heroStats.setPreferredSize(new Dimension(300, 300));

        layout.putConstraint(SpringLayout.NORTH, label,  200, SpringLayout.NORTH, this);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, label, 0, SpringLayout.HORIZONTAL_CENTER, this);

        layout.putConstraint(SpringLayout.NORTH, inputName,  5, SpringLayout.SOUTH, label);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, inputName, 0, SpringLayout.HORIZONTAL_CENTER, this);

        layout.putConstraint(SpringLayout.NORTH, classesComboBox,  10, SpringLayout.SOUTH, inputName);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, classesComboBox, 0, SpringLayout.HORIZONTAL_CENTER, this);

        layout.putConstraint(SpringLayout.NORTH, heroStats,  10, SpringLayout.SOUTH, classesComboBox);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, heroStats, 0, SpringLayout.HORIZONTAL_CENTER, this);

        layout.putConstraint(SpringLayout.NORTH, previousScr,  10, SpringLayout.SOUTH, startGame);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, previousScr, 0, SpringLayout.HORIZONTAL_CENTER, this);

        layout.putConstraint(SpringLayout.NORTH, startGame,  10, SpringLayout.SOUTH, heroStats);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, startGame, 0, SpringLayout.HORIZONTAL_CENTER, this);




        add(label);
        add(heroStats);
        add(inputName);
        add(classesComboBox);
        add(startGame);
        add(previousScr);

    }

    /*public void addHeroOneActionListener(ActionListener btn)
    {
        heroOne.addActionListener(btn);
    }*/

    public void addStartGameActionListener(ActionListener btn)
    {
        startGame.addActionListener(btn);
    }

    public void addPrevHeroActionListener(ActionListener btn)
    {
        previousScr.addActionListener(btn);
    }
}
