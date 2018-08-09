package com.pin.patterndemo.behavioral.memento;

/**
 * Created by HH on 2018/8/6.
 */

public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}