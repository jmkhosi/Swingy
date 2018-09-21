package za.co.wethinkcode.student.joyce.view;

import za.co.wethinkcode.student.joyce.model.Game;
import za.co.wethinkcode.student.joyce.model.characters.Hero;
import za.co.wethinkcode.student.joyce.model.characters.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class GameArenaScreenPanel extends JPanel {

    JButton northbtn = new JButton("North");
    JButton westbtn = new JButton("West");
    JButton eastbtn = new JButton("East");
    JButton southbtn = new JButton("South");
    JButton prvbtn = new JButton("Previous Screen");
    JButton exitbtn = new JButton("Exit Game");
    private MapPanel mapPanel;

    private JLabel player;
    // private List<JLabel> tiles;
    Point positions;


    public GameArenaScreenPanel(Game game, Hero hero) {
        this.setBackground(Color.cyan);

        mapPanel = new MapPanel(game, hero);
        this.add(mapPanel);

        //tiles = new List<JLabel>(25);


        SpringLayout layout = new SpringLayout();
        setLayout(layout);

        layout.putConstraint(SpringLayout.VERTICAL_CENTER, mapPanel, 0, SpringLayout.VERTICAL_CENTER, this);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, mapPanel, 0, SpringLayout.HORIZONTAL_CENTER, this);

        add(northbtn);
        add(westbtn);
        add(eastbtn);
        add(southbtn);
        add(prvbtn);
        add(exitbtn);


        layout.putConstraint(SpringLayout.NORTH, exitbtn, 0, SpringLayout.NORTH, this);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, exitbtn, -55, SpringLayout.EAST, this);

        layout.putConstraint(SpringLayout.NORTH, northbtn, 5, SpringLayout.SOUTH, mapPanel);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, northbtn, 0, SpringLayout.HORIZONTAL_CENTER, this);

        layout.putConstraint(SpringLayout.NORTH, westbtn, 5, SpringLayout.SOUTH, northbtn);
        layout.putConstraint(SpringLayout.WEST, westbtn, 300, SpringLayout.WEST, this);

        layout.putConstraint(SpringLayout.NORTH, eastbtn, 0, SpringLayout.SOUTH, northbtn);
        layout.putConstraint(SpringLayout.EAST, eastbtn, -300, SpringLayout.EAST, this);

        layout.putConstraint(SpringLayout.NORTH, southbtn, 50, SpringLayout.SOUTH, northbtn);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, southbtn, 0, SpringLayout.HORIZONTAL_CENTER, this);

    }

    public String showBattleOption() {
        JFrame frame = new JFrame("Battle");
        final String[] options = { "Run", "Fight" };

        String result = (String) JOptionPane.showInputDialog(frame,
                "You are in a battle?",
                "Battle",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        return result;
    }


    public class MapPanel extends JPanel {
        MapPanel(Game game, Hero hero) {

            this.setLayout(new GridLayout(game.mapsize, game.mapsize));
            this.setBorder(BorderFactory.createEtchedBorder(Color.RED, Color.BLUE));
            this.setPreferredSize(new Dimension(500, 500));
            this.setBackground(Color.orange);

            int numberOfTiles = game.mapsize * game.mapsize;

            for (int i = 0; i < numberOfTiles; i++) {
                TilePanel tile = new TilePanel();
                this.add(tile);
            }
        }

        public void updateMap(Game game) {
            int count = 0;

            for (int y = 0; y < game.mapsize; y++) {
                for (int x = 0; x < game.mapsize; x++) {
                    TilePanel tilePanel = (TilePanel) getComponent(count);
                    count++;
                    Player player = game.map[y][x];
                    if (player != null)
                        tilePanel.label.setText(player.name);
                    else
                        tilePanel.label.setText("");
                }
            }
        }
    }

    public void updateMap(Game game) {
        mapPanel.updateMap(game);
    }


    public class TilePanel extends JPanel {
        JLabel label = new JLabel();

        TilePanel() {
            this.setBorder(BorderFactory.createEtchedBorder(Color.RED, Color.BLACK));
            this.setBackground(Color.lightGray);
            this.add(label);
        }

    }

    public void addPRVScreenActionListener(ActionListener btn) {
        prvbtn.addActionListener(btn);
    }

    public void addNewNorthActionListener(ActionListener btn) {
        northbtn.addActionListener(btn);

    }



    public void addNewSouthActionListener(ActionListener btn) {
        southbtn.addActionListener(btn);

    }

    public void addNewEastActionListener(ActionListener btn) {
        eastbtn.addActionListener(btn);

    }

    public void addNewWestActionListener(ActionListener btn) {
        westbtn.addActionListener(btn);

    }



}


