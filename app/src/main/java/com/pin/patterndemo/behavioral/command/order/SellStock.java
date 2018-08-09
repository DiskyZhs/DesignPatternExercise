package com.pin.patterndemo.behavioral.command.order;

import com.pin.patterndemo.behavioral.command.Stock;

/**
 * Command的实现类，具体的指令
 */

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}