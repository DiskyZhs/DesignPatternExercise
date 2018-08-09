package com.pin.patterndemo.creationalPattern.builder;

import android.util.Log;

/**
 * ConcreteBuilder：Builder接口的实现类，并返回组建好对象实例。
 * Created by HH on 2018/7/30.
 */

public class WomwComputerBuilder implements ComputerBuilder {
    private Computer mComputer = new Computer();

    @Override
    public void buildCpu(String cpu) {
        Log.e("WomwComputerBuilder", "Womw buildCpu" + cpu);
        mComputer.setCpu("Womw" + cpu);
    }

    @Override
    public void buildMainBoard(String mainBoard) {
        Log.e("WomwComputerBuilder", "Womw buildMainBoard" + mainBoard);
        mComputer.setMainBoard("Womw" + mainBoard);
    }

    @Override
    public void buildRam(String ram) {
        Log.e("WomwComputerBuilder", "Womw buildRam" + ram);
        mComputer.setRam("Womw" + ram);
    }

    @Override
    public void buildSystem(String system) {
        Log.e("WomwComputerBuilder", "Womw buildSystem" + system);
        mComputer.setSystem("Womw" + system);
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
