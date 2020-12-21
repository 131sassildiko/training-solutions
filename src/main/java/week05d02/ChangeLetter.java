package week05d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChangeLetter {

    public static final char[] VOWELS = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

    public String changeVowels(String text) {
        for (char i : VOWELS) {
            text = text.replace(i, '*');
        }
        return text;
    }
}