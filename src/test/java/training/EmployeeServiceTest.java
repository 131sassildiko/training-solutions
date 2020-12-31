package training;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {

    @Test
    public void testCreateEmployee (){
        new EmployeeService().createEmployee("John Doe", 1970, EmployeeType.FULL_TIME);
    }

    @Test
    public void testFind(){
        List<String> names = Arrays.asList("John Doe", "Jane Doe", "Jack Doe");
        Result result = new EmployeeService().findEmployee("Jane", names);

        assertEquals("Jane Doe", result.getName());
        assertEquals(1, result.getIndex());

    }
}