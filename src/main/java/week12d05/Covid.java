package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Covid {

    public int wordCounter (String word){
        Path file = Path.of("src/main/resources/index.html");
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            int counter=0;
            while ((line=br.readLine())!=null) {
                if (line.toLowerCase().contains(word)) {
                    counter++;
                }
            }
            return counter;

        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read file", e);
        }
    }

    public static void main(String[] args) {
        Covid covid = new Covid();
        System.out.println(covid.wordCounter("koronavírus"));
    }
}
