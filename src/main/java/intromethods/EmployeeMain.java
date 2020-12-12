package intromethods;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee("Jenő", 1990, 100000);

        System.out.println(employee);

        int newsalary= employee.raiseSalary(50);

        System.out.println("Jenő new salary: " + newsalary);


    }
}
