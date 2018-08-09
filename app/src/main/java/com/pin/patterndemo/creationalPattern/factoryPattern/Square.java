package com.pin.patterndemo.creationalPattern.factoryPattern;

import android.util.Log;

/**
 * Created by HH on 2018/7/30.
 */

public class Square implements com.pin.patterndemo.creationalPattern.factoryPattern.Shape {
    @Override
    public void draw() {
        Log.e("SHAPE", "Square");
    }
}
