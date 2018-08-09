package com.pin.patterndemo.behavioral.interpreter;

/**
 * Created by HH on 2018/8/6.
 */

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
