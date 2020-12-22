package week05d03;

import java.util.ArrayList;
import java.util.List;

public class ListCounter {

    List<String> words = new ArrayList<>();

    public int counter(List<String> words) {
        int i = 0;
        for (String s : words) {
            if (s.startsWith("a") || s.startsWith("A")) {
                i++;
            }
        }
        return i;
    }
}

