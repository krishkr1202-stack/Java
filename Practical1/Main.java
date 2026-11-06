
class Student {

    // Instance variables
    int rollNumber;
    String name;
    int subject1, subject2, subject3;
  
    Student(int rollNumber, String name,
            int subject1, int subject2, int subject3) {

        this.rollNumber = rollNumber;
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    int calculateTotal() {
        return subject1 + subject2 + subject3;
    }

    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Subject 1 Marks: " + subject1);
        System.out.println("Subject 2 Marks: " + subject2);
        System.out.println("Subject 3 Marks: " + subject3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("----------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating three Student objects
        Student s1 = new Student(101, "Rahul", 85, 90, 80);
        Student s2 = new Student(102, "Priya", 92, 88, 95);
        Student s3 = new Student(103, "Amit", 75, 80, 85);

        // Displaying student details
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
