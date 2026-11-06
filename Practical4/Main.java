class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Employee {
    public double calculatePay() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}

class Contractor extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Contractor(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add two integers (5 + 10): " + calc.add(5, 10));
        System.out.println("Add two doubles (5.5 + 4.2): " + calc.add(5.5, 4.2));
        System.out.println("Add three integers (1 + 2 + 3): " + calc.add(1, 2, 3));

        System.out.println("----------------------------------------");
        Employee emp1 = new FullTimeEmployee(60000.0);
        Employee emp2 = new Contractor(45.0, 160);

        System.out.println("Full-Time Employee Pay: " + emp1.calculatePay());
        System.out.println("Contractor Pay: " + emp2.calculatePay());
    }
}
