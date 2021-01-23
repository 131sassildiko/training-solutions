package training;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EmployeeService7 {
    public static void main(String[] args) {
        Path path = Path.of("data.dat");


        try {
            Files.delete (Path.of("data2.dat")); // törli data2.dat-ot
        } catch (IOException e) {
            throw new IllegalStateException("Can not get", e);
        }
    }
}
