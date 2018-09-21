package za.co.wethinkcode.student.joyce.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class HomeScreenPanel extends JPanel {

    JLabel label = new JLabel("Welcome to Lengends");

    JButton newHero = new JButton("New Game");
    JButton loadBtn = new JButton("Load Game");

    public HomeScreenPanel() {
        setBackground(Color.PINK);

        add(newHero);
        add(loadBtn);

    }

    public void addNewHeroActionListener(ActionListener btn) {
        newHero.addActionListener(btn);
//        loadBtn.addActionListener(btn);
    }
}
