package za.co.wethinkcode.student.joyce.model.characters;

import com.sun.tools.javac.util.Position;

public class Orc extends Enemy {

    public Orc(String name, int level, int experience, int attack, int hitPoint, int defence, Position position)
    {
        super(name, level, experience, attack, hitPoint, defence, position);
    }
}
