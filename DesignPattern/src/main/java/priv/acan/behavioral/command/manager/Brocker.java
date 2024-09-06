package priv.acan.behavioral.command.manager;

import priv.acan.behavioral.command.intf.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acan
 * @since 2022/12/21 23:10
 */
public class Brocker {

    private final List<Order> list = new ArrayList<>();

    public void takeOrder(Order order) {
        list.add(order);
    }

    public void placeOrders() {
        for (Order order : list) {
            order.execute();
        }
        list.clear();
    }
}
