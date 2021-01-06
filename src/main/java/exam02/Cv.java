package exam02;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    Skill sk = new Skill();

    public String getSkills (String name, String skill){
        return name + sk.getSkills() + "(" + sk.getLevel() + ")";
    }


    public List <String> addSkills (String name, List<String> skillList){
        List <String> skillList1 = new ArrayList<>();
        skillList1.add (sk.skillCreate());
        return skillList1;
    }

        public List <Skill> findSkillLevelByName (String inputname){
            List<Skill> foundskills = new ArrayList<>();
            for (Skill skill:foundskills) {
                if (name == inputname)
                foundskills.add (skill);
            }
            return foundskills;
    }


}
