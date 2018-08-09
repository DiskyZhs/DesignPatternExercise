package com.pin.patterndemo.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HH on 2018/8/6.
 */

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}