package priv.acan.behavioral.command.in.impl;

import lombok.AllArgsConstructor;
import priv.acan.behavioral.command.in.Order;
import priv.acan.behavioral.command.model.Stock;

/**
 * @author acan
 * @version 2022/12/21 23:08
 */
@AllArgsConstructor
public class SellStock implements Order {

    private final Stock stock;

    @Override
    public void execute() {
        stock.sell();
    }
}
