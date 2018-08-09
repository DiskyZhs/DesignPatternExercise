package com.pin.patterndemo.behavioral.strategy;

/**
 * Created by HH on 2018/8/7.
 */

public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}