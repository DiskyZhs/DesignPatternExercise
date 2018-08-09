package com.pin.patterndemo.behavioral.command;

import com.pin.patterndemo.behavioral.command.order.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoke类，负责管理指令以及其执行（当然也可以处理撤销以及回退的操作等）
 */

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}