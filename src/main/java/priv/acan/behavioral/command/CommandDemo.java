package priv.acan.behavioral.command;

import priv.acan.behavioral.command.intf.impl.BuyStock;
import priv.acan.behavioral.command.intf.impl.SellStock;
import priv.acan.behavioral.command.manager.Brock;
import priv.acan.behavioral.command.model.Stock;

/**
 * @author acan
 * @since 2022/12/21 23:12
 */
public class CommandDemo {

    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Brock brock = new Brock();
        brock.takeOrder(buyStock);
        brock.takeOrder(sellStock);

        brock.placeOrders();
    }
}
