package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CityOperations {

    public String findCityWithMaxLength(BufferedReader reader) {
        String maxCityName = "";
        try {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                String[] parts = line.split(";");
                String name = parts[1];
                //System.out.println(name);
                if (name.length() > maxCityName.length()) {
                    maxCityName = name;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

        return maxCityName;
    }

    public static void main(String[] args) {
        try (BufferedReader bufferedreader =
                     Files.newBufferedReader(Path.of("varosok.txt"))) {
            String city = new CityOperations().findCityWithMaxLength(bufferedreader);
            System.out.println(city);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
