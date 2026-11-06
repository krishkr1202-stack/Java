class Employee {
    private String name;
    private double salary;
    private static int count = 0;

    public Employee() {
        this("Default Name", 0.0);
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        Employee.count++;
    }

    public void display() {
        System.out.println("Name: " + this.name + ", Salary: " + this.salary);
    }

    public static void displayCount() {
        System.out.println("Total Employees Created: " + Employee.count);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee.displayCount();

        Employee emp1 = new Employee();
        emp1.display();

        Employee emp2 = new Employee("Aarav", 75000.0);
        emp2.display();

        Employee emp3 = new Employee("Neha", 90000.0);
        emp3.display();

        Employee.displayCount();
    }
}
