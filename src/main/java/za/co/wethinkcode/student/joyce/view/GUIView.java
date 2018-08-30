package za.co.wethinkcode.student.joyce.view;

import javax.swing.*;
import java.awt.*;

public class GUIView {
    JFrame mainWndow = new JFrame();


    public GUIView() {

        mainWndow.setSize(new Dimension(1000, 900));
        mainWndow.setResizable(true);
        mainWndow.setVisible(true);
        mainWndow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void switchPanel(JPanel panel) {
        mainWndow.setContentPane(panel);
        mainWndow.setVisible(true);
    }
}
