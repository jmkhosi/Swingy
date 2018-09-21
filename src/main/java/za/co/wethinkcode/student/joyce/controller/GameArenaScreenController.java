package za.co.wethinkcode.student.joyce.controller;

import za.co.wethinkcode.student.joyce.model.Game;
import za.co.wethinkcode.student.joyce.model.characters.Enemy;
import za.co.wethinkcode.student.joyce.model.characters.Hero;
import za.co.wethinkcode.student.joyce.model.characters.Orc;
import za.co.wethinkcode.student.joyce.model.characters.Player;
import za.co.wethinkcode.student.joyce.view.GameArenaScreenPanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class GameArenaScreenController {

    GameArenaScreenPanel gameArenaScreenPanel;
    GUIController guiController;
    Game game;

    public GameArenaScreenController(GUIController guiController, GameArenaScreenPanel gameArenaScreenPanel, Game game) {
        this.gameArenaScreenPanel = gameArenaScreenPanel;
        this.guiController = guiController;
        this.game = game;
        initGame();
        gameArenaScreenPanel.addPRVScreenActionListener(btnPRVScreenListener);
        gameArenaScreenPanel.addNewNorthActionListener(addNewNorthActionListener);
        gameArenaScreenPanel.addNewSouthActionListener(addNewSouthActionListener);
        gameArenaScreenPanel.addNewEastActionListener(addNewEastActionListener);
        gameArenaScreenPanel.addNewWestActionListener(addNewWestActionListener);
    }

    public void initGame() {
        placeHeroInTheCenter();
        createMap();
        createEnemies();
        putHeroIntoTheMap();
        updateMap();
    }

    private void putHeroIntoTheMap() {

        Hero hero = game.hero;
        putPlayerIntoMap(hero);
    }

    private void putPlayerIntoMap(Player player) {
        game.map[player.position.y][player.position.x] = player;
    }

    private void updateMap()
    {
        gameArenaScreenPanel.updateMap(game);
    }

    private void createEnemies() {
        for (int i = 0; i < game.mapsize * 4; i++) {
            Enemy enemy = getRandomEnemy();
            putPlayerIntoMap(enemy);
        }
    }

    private Enemy getRandomEnemy() {

        ArrayList<Enemy> enemies = new ArrayList<>();
        Random random = new Random();

        enemies.add(new Orc());
        // enemies.add(new ());
        int randomIndex = random.nextInt(enemies.size());

        // Have an arraylist of enemies
        // Find a random number
        // Make the random number is bounded to the size of the array list
        // get the index of the array list according to the random number
        Enemy enemy = enemies.get(randomIndex);
        int randomX = random.nextInt(game.mapsize);
        int randomY = random.nextInt(game.mapsize);

        enemy.position = new Point(randomY, randomX);

        return enemy;
    }

    private void createMap() {
        game.map = new Player[game.mapsize][game.mapsize];
    }

    private void placeHeroInTheCenter() {

        Hero hero = game.hero;
        Point position = hero.position;
        position.x = game.mapsize / 2;
        position.y = game.mapsize / 2;
    }


    private ActionListener btnPRVScreenListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            guiController.showHeroSelection();
        }
    };



    private void playerwon() {
        System.out.println("PLayer won");

        System.exit(0);
    }


    ActionListener addNewNorthActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            removePlayer(game.hero);

            int tempY = game.hero.position.y-1;

            if (tempY >= 0){

                game.hero.position.y--;

                if (isHeroInABattle())
                {
                    String result = gameArenaScreenPanel.showBattleOption();

                    if (result.equals("Fight"))
                        fight();
                    else
                        runAway();
                }
                else
                {
                    putHeroIntoTheMap();
                    updateMap();
                }
            }
            else playerwon();

        }
    } ;

    private void runAway() {
        System.out.println("PLayer ran | not implemented");

    }

    private void fight() {
        Point position = game.hero.position;

        Player enemy = game.map[position.y][position.x];
        Player hero = game.hero;

        while (enemy.hitPoint > 0 && hero.hitPoint > 0 ){
            attack(hero, enemy);
            attack(enemy, hero);
        }

        if (hero.hitPoint > enemy.hitPoint) {
            System.out.println("PLayer won");
            updateExperience();
            levelUp(hero);
            putHeroIntoTheMap();
            updateMap();
        }
        else
        {
            System.out.println("PLayer lost");
            System.exit(0);
        }
    }

    private void levelUp(Player hero) {
        for (int level = 0; level < 50; level++) {
            int requiredExperience  = (level-1)*5+10-(level%2);
            if (hero.experience <= requiredExperience)
                hero.level = level;
        }
    }

    private void updateExperience() {
        Hero hero = game.hero;
        hero.experience =+ 100;
    }

    public void attack(Player playerOne, Player playerTwo){
        int totalAttack = playerOne.attack - playerTwo.defence;
        totalAttack += getRandomAttack();
        playerTwo.hitPoint -= totalAttack;
    }

    private int getRandomAttack() {
        Random random = new Random();

        return random.nextInt(70)+ 30;
    }


    private boolean isHeroInABattle() {
        Point position = game.hero.position;
        Player player = game.map[position.y][position.x];

        if (player == null)
            return false;
        return true;
    }


    ActionListener addNewSouthActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            removePlayer(game.hero);

            int tempY = game.hero.position.y+1;

            if (tempY < game.mapsize){

                game.hero.position.y++;
                putHeroIntoTheMap();
                updateMap();

            }
            else playerwon();

        }
    };

    ActionListener addNewEastActionListener = new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {

            removePlayer(game.hero);

            int tempX = game.hero.position.x+1;

            if (tempX < game.mapsize){

                game.hero.position.x++;
                putHeroIntoTheMap();
                updateMap();

            }
            else playerwon();

        }
    };

    ActionListener addNewWestActionListener = new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {

            removePlayer(game.hero);

            int tempX = game.hero.position.x-1;

            if (tempX >= 0){

                game.hero.position.x--;
                putHeroIntoTheMap();
                updateMap();

            }
            else playerwon();


        }
    };

    private void removePlayer(Player player) {

        game.map[player.position.y][player.position.x] = null;
    }
}