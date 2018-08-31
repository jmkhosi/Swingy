package za.co.wethinkcode.student.joyce.view;

import za.co.wethinkcode.student.joyce.model.Game;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class GameArenaScreenPanel extends JPanel {

    JButton northbtn = new JButton("North");
    JButton westbtn = new JButton("West");
    JButton eastbtn = new JButton("East");
    JButton southbtn = new JButton("South");


    public GameArenaScreenPanel(Game game) {
        this.setBackground(Color.cyan);
        MapPanel arena = new MapPanel(game);
        this.add(arena);

        SpringLayout layout = new SpringLayout();
        setLayout(layout);

        layout.putConstraint(SpringLayout.VERTICAL_CENTER, arena,  0, SpringLayout.VERTICAL_CENTER, this);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, arena, 0, SpringLayout.HORIZONTAL_CENTER, this);

        add(northbtn);
        add(westbtn);
        add(eastbtn);
        add(southbtn);

        layout.putConstraint(SpringLayout.NORTH, northbtn,  5, SpringLayout.SOUTH, arena);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, northbtn, 0, SpringLayout.HORIZONTAL_CENTER, this);

        layout.putConstraint(SpringLayout.NORTH, westbtn,  5, SpringLayout.SOUTH, northbtn);
        layout.putConstraint(SpringLayout.WEST, westbtn, 300, SpringLayout.WEST, this);

        layout.putConstraint(SpringLayout.NORTH, eastbtn,  0, SpringLayout.SOUTH, northbtn);
        layout.putConstraint(SpringLayout.EAST, eastbtn, -300, SpringLayout.EAST, this);

        layout.putConstraint(SpringLayout.NORTH, southbtn,  50, SpringLayout.SOUTH, northbtn);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, southbtn, 0, SpringLayout.HORIZONTAL_CENTER, this);




    }


    public class MapPanel extends JPanel{
        MapPanel(Game game){





            this.setLayout(new GridLayout(game.mapsize, game.mapsize));
            this.setBorder(BorderFactory.createEtchedBorder(Color.RED, Color.BLUE));
            this.setBackground(Color.orange);
            this.setPreferredSize(new Dimension(600, 600));
            add(new TilePanel());

            int numberOfTiles = game.mapsize * game.mapsize;
            for( int i = 1; i < numberOfTiles; i++ ){
                TilePanel tile = new TilePanel();
                this.add(tile);
            }
        }
    }

    public class TilePanel extends JPanel{
        TilePanel() {
            this.setBorder(BorderFactory.createEtchedBorder(Color.RED, Color.BLACK));
            this.setBackground(Color.lightGray);
        }

    }





}


