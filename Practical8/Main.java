class Product {
    private String productName;
    private double price;
    private int quantity;

    public Product() {
        this.productName = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
    }

    public Product(String productName) {
        this.productName = productName;
        this.price = 0.0;
        this.quantity = 0;
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        this.quantity = 0;
    }

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotalCost() {
        return price * quantity;
    }

    public void display() {
        System.out.println("Product: " + productName + ", Price: " + price + ", Quantity: " + quantity + ", Total Cost: " + calculateTotalCost());
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Smartphone", 45000.0);
        Product p4 = new Product("Headphones", 2500.0, 3);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}
