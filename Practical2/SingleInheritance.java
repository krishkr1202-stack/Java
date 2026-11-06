
class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    String model = "Fortuner";

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    void drive() {
        System.out.println("Car is moving...");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Car c = new Car();

        c.display();
        c.start();
        c.drive();
    }
}
