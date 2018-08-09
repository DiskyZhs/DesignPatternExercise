package com.pin.patterndemo.behavioral.visitor;

/**
 * 被操作类中留下的操作数据的接口
 * Created by HH on 2018/8/7.
 */

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
