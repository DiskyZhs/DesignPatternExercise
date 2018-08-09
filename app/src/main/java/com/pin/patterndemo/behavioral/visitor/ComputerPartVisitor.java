package com.pin.patterndemo.behavioral.visitor;

/**
 * Created by HH on 2018/8/7.
 */

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}