package za.co.wethinkcode.student.joyce.model.characters;
import java.awt.*;

public class Knight extends Hero {


    public Knight(String name)
    {

        this.name = name;
        level = 0;
        experience = 0;
        attack = 30;
        hitPoint = 10;
        defence = 35;
        position = new Point(0,0);
        charactertype = CharacterType.HERO;
        heroClassType = "Knight";
    }
}
