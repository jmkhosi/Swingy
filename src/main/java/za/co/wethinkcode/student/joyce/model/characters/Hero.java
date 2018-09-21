package za.co.wethinkcode.student.joyce.model.characters;

import java.awt.*;

public class Hero extends Player {
    public String heroClassType;

    public String winningMessage;
    public String losingMessage;

    public Hero(String name, int level, int experience, int attack, int hitPoint, int defence, Point position) {
        super(name, level, experience, attack, hitPoint, defence, position, CharacterType.HERO);
    }

    public Hero() {
        super();
    }

    public void setWinningMessage(String winningMessage) {
        this.winningMessage = winningMessage;
    }

    public void setLosingMessage(String losingMessage) {
        this.losingMessage = losingMessage;
    }

    public String getWinningMessage() {
        return winningMessage;
    }

    public String getLosingMessage() {
        return losingMessage;
    }




}