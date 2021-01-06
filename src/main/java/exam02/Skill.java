package exam02;

import java.util.List;

public class Skill {

    private String skills;
    private int level;

    public Skill(String skills, int level) {
        this.skills = skills;
        this.level = level;
    }

    public Skill() {

    }

    public String getSkills() {
        return skills;
    }

    public int getLevel() {
        return level;
    }

    public String skillCreate () {
         return skills + "(" + level + ")";
    }

}
