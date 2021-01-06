package exam02;

import java.util.ArrayList;
import java.util.List;

public class Cv extends Skill {

    private String name;

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    Skill skill = new Skill();

    private List<Skill> skillList = new ArrayList<>();
    public void addSkills (String name){
        skillList.add(new Skill());
    }

        public List <Skill> findSkillLevelByName (String inputname){
            List<Skill> skills = new ArrayList<>();
            for (Skill skill:skills) {
                if (name == inputname)
                skills.add (skill);
            }
            return skills;
    }


}
