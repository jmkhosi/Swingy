package za.co.wethinkcode.student.joyce.model.characters;

import com.sun.tools.javac.util.Position;

public class Enemy extends Player{

    public String winningMessage;
    public String losingMessage;

    public Enemy(String name, int level, int experience, int attack, int hitPoint, int defence, Position position) {

        super(name, level, experience, attack, hitPoint, defence, position, CharacterType.ENEMY);
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
