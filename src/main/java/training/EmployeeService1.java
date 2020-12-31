package training;

import java.util.List;

public class EmployeeService1 {
    public void tryChangeValues (int yearOfBirth, String name, List<String> courses){
        yearOfBirth = 1970;
        name = "John";
        courses.add("Java");
    }

}
