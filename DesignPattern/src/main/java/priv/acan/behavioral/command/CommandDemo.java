package priv.acan.behavioral.command;

import priv.acan.behavioral.command.in.impl.BuyStock;
import priv.acan.behavioral.command.in.impl.SellStock;
import priv.acan.behavioral.command.manager.Brocker;
import priv.acan.behavioral.command.model.Stock;

/**
 * @author acan
 * @version 2022/12/21 23:12
 */
public class CommandDemo {

    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Brocker brocker = new Brocker();
        brocker.takeOrder(buyStock);
        brocker.takeOrder(sellStock);

        brocker.placeOrders();
    }
}
