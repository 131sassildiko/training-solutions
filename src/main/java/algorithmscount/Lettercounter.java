package algorithmscount;

public class Lettercounter {

    public int countLetters (String s, char c) {
        int count = 0;
        for (int i=0; i<s.length();i++){
            if (s.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
}
