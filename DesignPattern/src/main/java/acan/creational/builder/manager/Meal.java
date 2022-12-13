package acan.creational.builder.manager;

import acan.creational.builder.in.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acan
 * @version 2022/12/12 03:56
 */
public class Meal {

    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double getCost() {
        double cost = 0;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItem() {
        for (Item item : items) {
            System.out.println(item.name());
            System.out.println(item.packing().pack());
            System.out.println(item.price());
        }
    }
}
