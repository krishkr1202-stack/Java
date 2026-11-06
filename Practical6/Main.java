class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 499.0);
        Book book3 = new Book(book2);

        System.out.println("Book 1 (No-arg constructor):");
        book1.display();

        System.out.println("Book 2 (Parameterized constructor):");
        book2.display();

        System.out.println("Book 3 (Copy constructor):");
        book3.display();

        book3.setTitle("The Alchemist - Special Edition");
        book3.setPrice(699.0);

        System.out.println("\nAfter modifying Book 3:");
        System.out.print("Book 2: ");
        book2.display();
        System.out.print("Book 3: ");
        book3.display();
    }
}
