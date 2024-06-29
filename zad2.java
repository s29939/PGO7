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

    public void show() {
        System.out.println(name);
    }
}

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Task 2");
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "apple"));
        products.add(new Product(2, "book"));
        products.add(new Product(3, "backpack"));
        products.add(new Product(4, "mug"));
        products.add(new Product(5, "car"));

        System.out.println("\nUsing get() and show()");
        for (int i = 0; i < products.size(); i++) {
            products.get(i).show();
        }

        Map<Integer, String> productMap = new HashMap<>();

        for (Product product : products) {
            productMap.put(product.getId(), product.getName());
        }

        Set<Map.Entry<Integer, String>> entrySet = productMap.entrySet();

        System.out.println("\nUsing entrySet() [id : name]");
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

    ma menu kontekstowe