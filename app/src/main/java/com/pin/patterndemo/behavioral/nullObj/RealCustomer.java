package com.pin.patterndemo.behavioral.nullObj;

/**
 * Created by HH on 2018/8/7.
 */

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}