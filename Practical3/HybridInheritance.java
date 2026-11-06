
class Device {
    void powerOn() {
        System.out.println("Device is powered on.");
    }
}

interface Connectable {
    void connect();
}

interface Printable {
    void print();
}

class SmartPrinter extends Device
        implements Connectable, Printable {

    public void connect() {
        System.out.println("Printer connected to WiFi.");
    }

    public void print() {
        System.out.println("Printing document...");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {

        SmartPrinter printer = new SmartPrinter();

        printer.powerOn();
        printer.connect();
        printer.print();
    }
}
