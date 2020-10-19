package Map.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * same hashcode but different instance; it doesn't overlap each other;
 * same hashcode and equalTo each other; it overlaps each other;
 * In the stream(), it requires a merger function to handle such a case.
 */

class Tester {
    private int id;

    public Tester(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id % 10;
    }

    @Override
    public String toString() {
        return "tester " + id;
    }
}


class Product {
    private int id;

    public Product(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id % 10;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public String toString() {
        return "product " + id;
    }
}


public class HashMapHashCodeEqualTo {

    public static void main(String[] args) {
        Tester tester1 = new Tester(10);
        Tester tester2 = new Tester(20);

        System.out.println("tester1 equalTo tester2 ?" + (tester1.equals(tester2)));
        System.out.println("hashcode equal? " + (tester1.hashCode() == tester2.hashCode()));

        Map<Tester, String> testerStringMap = new HashMap<>();
        testerStringMap.put(tester1, "tester1");
        testerStringMap.put(tester2, "tester2");
        testerStringMap.put(tester1, "tester3");
        System.out.println(testerStringMap);

        Product product1 = new Product(10);
        Product product2 = new Product(20);

        System.out.println("product1 equalTo product2 ? " + (product1.equals(product2)));
        Map<Product, String> productStringMap = new HashMap<>();

        productStringMap.put(product1, "product1");
        productStringMap.put(product2, "product2");

        System.out.println(productStringMap);

    }
}
