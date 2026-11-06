
class Shape {
    void display() {
        System.out.println("This is a Shape.");
    }
}

class Circle extends Shape {
    double radius = 5;

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.calculateArea();

        r.display();
        r.calculateArea();
    }
}
