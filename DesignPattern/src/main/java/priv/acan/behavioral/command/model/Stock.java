package priv.acan.behavioral.command.model;

import lombok.EqualsAndHashCode;

/**
 * @author acan
 * @since 2022/12/21 23:05
 */
@EqualsAndHashCode
public class Stock {

    private static final String NAME = "ABC";
    private static final int QUANTITY = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + NAME + ", Quantity: " + QUANTITY + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + NAME + ", Quantity: " + QUANTITY + " ] sold");
    }
}
