package com.pin.patterndemo.behavioral.strategy;

/**
 * Created by HH on 2018/8/7.
 */

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}