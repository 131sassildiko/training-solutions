package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List <String> stringListUnion (List<String> first, List <String> second) {
        List <String> result = new ArrayList<>(first);
        for (String s: second) {
            if(!result.contains (s)){
                result.add(s);
            }
        }
        return result;
    }
}
