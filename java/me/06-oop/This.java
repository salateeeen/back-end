class Product {
    private String name;

    Product(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println(this.name);
    }
}

public class This {
    public static void main(String[] args) {
        Product product = new Product("Laptop");

        product.printName();
    }
}
