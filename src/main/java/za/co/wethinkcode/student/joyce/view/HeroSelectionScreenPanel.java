package za.co.wethinkcode.student.joyce.view;

import za.co.wethinkcode.student.joyce.model.characters.Hero;

import javax.swing.*;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class HeroSelectionScreenPanel extends JPanel{


    JLabel label = new JLabel("   Choose Your Desired Hero Name");
    JTextField inputName = new JTextField(" ",15);
    private String[] heroClasses = {"Warrior", "Knight", "Elf"};
    private JComboBox<String> classesComboBox = new JComboBox<>(heroClasses);
    private JEditorPane infoPane = new JEditorPane();
    JButton startGame = new JButton("Start Game");
    JButton previousScr = new JButton("Previous Page");

    public HeroSelectionScreenPanel() {

        setBackground(Color.LIGHT_GRAY);
        SpringLayout layout = new SpringLayout();
        setLayout(layout);

        infoPane.setEditable(false);
        infoPane.setFont(new Font("monospaced", Font.PLAIN, 12));


        infoPane.setPreferredSize(new Dimension(300, 120));


        layout.putConstraint(SpringLayout.NORTH, label,  200, SpringLayout.NORTH, this);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, label, 0, SpringLayout.HORIZONTAL_CENTER, this);

        layout.putConstraint(SpringLayout.NORTH, inputName,  5, SpringLayout.SOUTH, label);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, inputName, 0, SpringLayout.HORIZONTAL_CENTER, this);

        layout.putConstraint(SpringLayout.NORTH, classesComboBox,  10, SpringLayout.SOUTH, inputName);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, classesComboBox, 0, SpringLayout.HORIZONTAL_CENTER, this);

        layout.putConstraint(SpringLayout.NORTH, infoPane,  10, SpringLayout.SOUTH, classesComboBox);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, infoPane, 0, SpringLayout.HORIZONTAL_CENTER, this);

        layout.putConstraint(SpringLayout.NORTH, previousScr,  10, SpringLayout.SOUTH, startGame);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, previousScr, 0, SpringLayout.HORIZONTAL_CENTER, this);

        layout.putConstraint(SpringLayout.NORTH, startGame,  10, SpringLayout.SOUTH, infoPane);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, startGame, 0, SpringLayout.HORIZONTAL_CENTER, this);


        add(label);
        add(inputName);
        add(classesComboBox);
        add(startGame);
        add(previousScr);
        add(infoPane);

    }

    public void setHeroStatisticsText(Hero hero) {

        infoPane.setText("Hero Class Type : "+ hero.heroClassType +
                        "\nCharacter Type : " + hero.charactertype +
                        "\nLevel : "+ hero.level +
                        "\nExperience : "+ hero.experience +
                        "\nAttack : "+ hero.attack +
                        "\nHit Point : "+ hero.hitPoint +
                        "\nDefence : "+ hero.defence );

    }

    public void addComboBoxListener(ActionListener comboBoxListener){
        classesComboBox.addActionListener(comboBoxListener);
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

    public void addtextFieldListener(DocumentListener textFieldListener) {

        inputName.getDocument().addDocumentListener(textFieldListener);
    }
}
