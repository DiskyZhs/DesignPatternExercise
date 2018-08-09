package com.pin.patterndemo.behavioral.visitor;

/**
 * Created by HH on 2018/8/7.
 */

public class Keyboard  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
