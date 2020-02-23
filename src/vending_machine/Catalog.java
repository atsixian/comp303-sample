package vending_machine;

import java.util.HashMap;

public class Catalog {
    /**
     * Return the price of a beverage
     * @param name name of beverage
     * @return its price
     */
    private static HashMap<String, Integer> catalog = new HashMap<>();

    static {
        catalog.put("Milk", 10);
        catalog.put("Butter Beer", 20);
        catalog.put("Love Potion", 50);
        catalog.put("Polyjuice", 200);
        catalog.put("Felix Felicis", 100);

    }

    public static int getPrice(String name){
        // That's the price to pay for asking for something that doesn't exist
        return catalog.getOrDefault(name, 1000);
    }
}
