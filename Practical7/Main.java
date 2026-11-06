class Resource {
    public Resource() {
        System.out.println("Object constructed.");
    }

    public void use() {
        System.out.println("Using the object.");
    }
}

public class Main {
    public static void main(String[] args) {
        Resource res = new Resource();
        res.use();
        
        res = null;
        
        System.out.println("Reference removed. Object is now eligible for garbage collection.");
        System.out.println("End of main method.");
    }
}
