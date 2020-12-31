package week06d03;

public class WordEraser {

    public String eraseWord (String words, String word) {
        String[] temp = words.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : temp) {
            if (!s.equals(word)) {
                sb.append(s + " ");
            }
        }
        return sb.toString().trim();
    }
}

