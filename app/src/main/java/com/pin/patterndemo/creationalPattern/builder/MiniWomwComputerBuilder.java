package com.pin.patterndemo.creationalPattern.builder;

import android.util.Log;

/**
 * ConcreteBuilder：Builder接口的实现类，并返回组建好对象实例。
 * 简化版的Builder，链式调用书写
 * Created by HH on 2018/7/30.
 */

public class MiniWomwComputerBuilder implements MiniComputerBuilder {
    private Computer mComputer = new Computer();

    @Override
    public MiniWomwComputerBuilder buildCpu(String cpu) {
        Log.e("WomwComputerBuilder", "Womw buildCpu" + cpu);
        mComputer.setCpu("Womw" + cpu);
        return this;
    }

    @Override
    public MiniWomwComputerBuilder buildMainBoard(String mainBoard) {
        Log.e("WomwComputerBuilder", "Womw buildMainBoard" + mainBoard);
        mComputer.setMainBoard("Womw" + mainBoard);
        return this;
    }

    @Override
    public MiniWomwComputerBuilder buildRam(String ram) {
        Log.e("WomwComputerBuilder", "Womw buildRam" + ram);
        mComputer.setRam("Womw" + ram);
        return this;
    }

    @Override
    public MiniWomwComputerBuilder buildSystem(String system) {
        Log.e("WomwComputerBuilder", "Womw buildSystem" + system);
        mComputer.setSystem("Womw" + system);
        return this;
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
