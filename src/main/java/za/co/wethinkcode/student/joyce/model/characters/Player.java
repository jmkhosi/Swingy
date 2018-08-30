package za.co.wethinkcode.student.joyce.model.characters;

import com.sun.tools.javac.util.Position;

public class Player {

        public String name;
        public int level;
        public int experience;
        public int attack;
        public int hitPoint;
        public int defence;
        public Position position;
        public CharacterType charactertype;


        public Player(String name, int level, int experience, int attack, int hitPoint, int defence, Position position, CharacterType charactertype)
        {
           this.name = name;
           this.level = level;
           this.experience = experience;
           this.attack = attack;
           this.hitPoint = hitPoint;
           this.defence = defence;
           this.position = position;
           this.charactertype = charactertype;
        }
}
