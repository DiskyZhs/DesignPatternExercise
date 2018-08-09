package com.pin.patterndemo.structural.decorator;

import android.util.Log;

/**
 * Created by HH on 2018/8/1.
 */

public class CarPaintedWrapper implements Car {
    private Car srcCar;

    private String paintedColor;

    public CarPaintedWrapper(Car srcCar) {
        this.srcCar = srcCar;
    }

    public CarPaintedWrapper(Car srcCar, String paintedColor) {
        this.srcCar = srcCar;
        this.paintedColor = paintedColor;
    }

    public String getPaintedColor() {
        return paintedColor;
    }

    public void setPaintedColor(String paintedColor) {
        this.paintedColor = paintedColor;
    }

    @Override
    public void run() {
        Log.e("CarPaintedWrapper", "Painted with " + paintedColor);
        srcCar.run();
    }
}
