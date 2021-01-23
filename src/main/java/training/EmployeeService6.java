package training;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService6 {

    public void writeEmployees(Writer writer) {
        List<String> employees = List.of("John Doe", "Jane Doe", "Jack Doe");
        PrintWriter printWriter = new PrintWriter(writer);
        for (String empoyee : employees) {
            printWriter.print(empoyee);
            printWriter.print(",");
            printWriter.println(200_000);
        }
    }

    public static void main(String[] args) {
        Path file = Path.of("employees6.txt");

        try (StringWriter stringWriter = new StringWriter()) {
            new EmployeeService6().writeEmployees(stringWriter);
            System.out.println(stringWriter.toString());
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write", ioe);
        }
    }
}
