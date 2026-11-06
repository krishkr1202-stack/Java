class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imag + other.imag);
    }

    public void display() {
        if (imag >= 0) {
            System.out.println(real + " + " + imag + "i");
        } else {
            System.out.println(real + " - " + (-imag) + "i");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(4.5, 3.2);
        ComplexNumber c2 = new ComplexNumber(1.2, -2.5);

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        ComplexNumber sum = c1.add(c2);
        System.out.print("Result of Addition: ");
        sum.display();
    }
}
