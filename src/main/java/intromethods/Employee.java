package intromethods;

public class Employee {

    private String name;
    private int hiringYear;
    private int salary;

    public Employee(String name, int hiringYear, int salary) {
        this.name = name;
        this.hiringYear = hiringYear;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getHiringYear() {
        return hiringYear;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int raiseSalary (int raise){
        int newsalary = salary + raise;
        return newsalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hiringYear=" + hiringYear +
                ", salary=" + salary +
                '}';
    }
}

