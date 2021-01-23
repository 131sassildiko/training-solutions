package training;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService4 {

    public static void main(String[] args) {
        Path file=Path.of("emloyees1.txt");
        try {
            Files.write(file, List.of("John Doe", "Jane Doe"));
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file",e);
        }
    }
}
