package com.pin.patterndemo.creationalPattern.factoryPattern;

import android.util.Log;

/**
 * Created by HH on 2018/7/30.
 */

public class Circle implements Shape {
    @Override
    public void draw() {
        Log.e("SHAPE", "Circle");
    }
}
