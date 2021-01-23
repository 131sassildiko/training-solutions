package training;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EmployeeService3 {

    public static void main(String[] args) {
        Path file = Path.of("employees.txt");
        String content = null;
        try {
            content = Files.readString(file);
        }catch (IOException e){
            throw new IllegalStateException("Can not read file", e);
        }
        System.out.println(content);
    }
}
