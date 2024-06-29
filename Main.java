import java.util.*;

class Product {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Task 3");
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "apple"));
        products.add(new Product(2, "book"));
        products.add(new Product(3, "backpack"));
        products.add(new Product(4, "mug"));
        products.add(new Product(5, "car"));
        products.add(new Product(6, "phone"));
        products.add(new Product(7, "stone"));
        products.add(new Product(8, "window"));
        products.add(new Product(9, "speaker"));
        products.add(new Product(10, "microphone"));

        List<Product> firstFiveProducts = products.subList(0, 5);

        Set<Product> productFirstFiveSet = new HashSet<>(firstFiveProducts);

        System.out.println("\nFirst 5 products [id : name]");
        for (Product product : productFirstFiveSet) {
            System.out.println(product.getId() + " : " + product.getName());
        }
    }
}