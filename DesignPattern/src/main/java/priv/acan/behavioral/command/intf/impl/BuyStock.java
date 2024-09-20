package priv.acan.behavioral.command.intf.impl;

import lombok.AllArgsConstructor;
import lombok.Builder;
import priv.acan.behavioral.command.intf.Order;
import priv.acan.behavioral.command.model.Stock;

/**
 * @author acan
 * @since 2022/12/21 23:04
 */
@AllArgsConstructor
public class BuyStock implements Order {

    private final Stock stock;

    @Override
    public void execute() {
        stock.buy();
    }
}
