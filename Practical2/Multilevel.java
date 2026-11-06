
class Person {
    String name = "Rahul";

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId = 101;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department = "IT";

    void displayManager() {
        System.out.println("Department: " + department);
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.displayPerson();
        m.displayEmployee();
        m.displayManager();
    }
}
