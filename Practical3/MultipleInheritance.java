
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        AllInOnePrinter printer = new AllInOnePrinter();

        printer.print();
        printer.scan();
    }
}
