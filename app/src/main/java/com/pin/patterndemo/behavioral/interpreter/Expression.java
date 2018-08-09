package com.pin.patterndemo.behavioral.interpreter;

/**
 * Created by HH on 2018/8/6.
 */

public interface Expression {
    public boolean interpret(String context);
}