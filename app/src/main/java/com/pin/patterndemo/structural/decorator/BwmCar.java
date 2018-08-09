package com.pin.patterndemo.structural.decorator;

import android.util.Log;

/**
 * Src 接口实现
 * Created by HH on 2018/8/1.
 */

public class BwmCar implements Car {
    private String ownerName;

    public BwmCar(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void run() {
        Log.e("BwmCar", ownerName + ",s Bwm di di di di");
    }
}
