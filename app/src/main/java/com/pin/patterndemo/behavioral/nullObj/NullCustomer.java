package com.pin.patterndemo.behavioral.nullObj;

/**
 * Created by HH on 2018/8/7.
 */

public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}