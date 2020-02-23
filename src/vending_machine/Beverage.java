package vending_machine;

import java.util.HashMap;

/**
 * Flyweight design pattern
 */
public class Beverage {
    // Immutable
    private final String aName;
    private final int aPrice;
    private final static HashMap<String, Beverage> aBeverage = new HashMap<>();

    static {
        aBeverage.put("Polyjuice", new Beverage("Polyjuice"));
        aBeverage.put("Milk", new Beverage("Milk"));
    }

    // Private constructor
    private Beverage(String pName) {
        aName = pName;
        aPrice = Catalog.getPrice(pName);
    }

    public Beverage getBeverage(String pName) {
        if (!aBeverage.containsKey(pName)) {
            // I'll make it for you, but it'll be expensive:P
            aBeverage.put(pName, new Beverage(pName));
        }
        return aBeverage.get(pName);
    }

}
