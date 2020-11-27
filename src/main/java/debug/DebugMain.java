package debug;

import java.util.Arrays;
import java.util.List;

public class DebugMain {
    public int find (List<String> words, String prefix) {
        int count =0;
        for (String word:words) {
            if (word.startsWith (prefix)) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count = new DebugMain().find (Arrays.asList ("one", "two", "three", "onehundred"), "one");
        System.out.println(count);

    }
}
