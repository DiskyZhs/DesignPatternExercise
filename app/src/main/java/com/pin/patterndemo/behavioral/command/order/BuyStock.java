package com.pin.patterndemo.behavioral.command.order;

import com.pin.patterndemo.behavioral.command.Stock;

/**
 * Command的实现类，具体的指令
 */

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
