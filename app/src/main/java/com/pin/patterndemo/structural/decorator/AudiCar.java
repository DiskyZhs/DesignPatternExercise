package com.pin.patterndemo.structural.decorator;

import android.util.Log;

/**
 * Src 接口实现
 * Created by HH on 2018/8/1.
 */

public class AudiCar implements Car {
    private String ownerName;

    public AudiCar(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void run() {
        Log.e("AudiCar", ownerName + ",s Audi di di di di");
    }
}
