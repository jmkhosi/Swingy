package za.co.wethinkcode.student.joyce.view;

import javax.swing.*;
import java.awt.*;

public class GridSquareComponent extends JComponent {

    public void paintComponent(Graphics g)
    {

        //static variables

        int xcoord=0;
        int ycoord=0;

        //Draw all the black squares
        //The side of each square is 100x100


        g.setColor(Color.darkGray);
        g.fillRect(0+xcoord,0+ycoord,100,100);
        g.fillRect(0+xcoord,200+ycoord,100,100);
        g.fillRect(200+xcoord,0+ycoord,100,100);
        g.fillRect(300+xcoord,100+ycoord,100,100);
        g.fillRect(100+xcoord,100+ycoord,100,100);
        g.fillRect(300+xcoord,300+ycoord,100,100);
        g.fillRect(200+xcoord,200+ycoord,100,100);
        g.fillRect(100+xcoord,300+ycoord,100,100);

    }
}
