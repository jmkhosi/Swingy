package za.co.wethinkcode.student.joyce.model.characters;

import com.sun.tools.javac.util.Position;


public class CharacterFactory {

    public static Player newPlayer(String name, int level, int experience, int attack, int hitPoint, int defence, Position position, CharacterType characterType) {

        if (characterType == CharacterType.HERO)
            return new Hero(name, level, experience, attack, hitPoint, defence, position);
        else
        if (characterType == CharacterType.ENEMY)
            return new Enemy(name, level, experience, attack, hitPoint, defence, position);
        return null;
    }

}
