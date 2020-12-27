package week06d01;

import java.util.ArrayList;
import java.util.List;

public class ListSelector {

    public String getEvenElements (List<String>words){
        StringBuilder result = new StringBuilder();
        if (words ==null) {
            throw new IllegalArgumentException("Null paremeter");
        }
        if (words.size()!=0){
            result.append("[");
            for(int i=0; i<words.size();i+=2){
                result.append(words.get(i));
            }
            result.append("]");
        }
        return result.toString();
    }
}
