package za.co.wethinkcode.student.joyce.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class HomeScreenPanel extends JPanel {


    JPanel names = new JPanel();
    JLabel name = new JLabel("Adventures Of Legends");

    JButton newHero = new JButton("New Game");
    JButton loadBtn = new JButton("Load Game");

    Font titleFont = new Font("Times New Roman", Font.PLAIN, 50);

    public HomeScreenPanel() {
        setBackground(Color.PINK);

        names.setBackground(Color.lightGray);
        name.setForeground(Color.white);
        name.setFont(titleFont);

        SpringLayout layout = new SpringLayout();
        setLayout(layout);

        layout.putConstraint(SpringLayout.NORTH, names,  200, SpringLayout.NORTH, this);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, names, 0, SpringLayout.HORIZONTAL_CENTER, this);

        layout.putConstraint(SpringLayout.NORTH, newHero,  100, SpringLayout.NORTH, names);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, newHero, 0, SpringLayout.HORIZONTAL_CENTER, this);

        layout.putConstraint(SpringLayout.NORTH, loadBtn,  25, SpringLayout.NORTH, newHero);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, loadBtn, 0, SpringLayout.HORIZONTAL_CENTER, this);


        add(names);
        names.add(name);
        add(newHero);
        add(loadBtn);

    }

    public void addNewHeroActionListener(ActionListener btn) {
        newHero.addActionListener(btn);

    }
}
