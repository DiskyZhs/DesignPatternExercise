package com.pin.patterndemo.creationalPattern.builder;

/**
 * Director：调用具体建造者来创建复杂对象的各个部分，在指导者中不涉及具体产品的信息，只负责保证对象各部分完整创建或按某种顺序创建。
 * Created by HH on 2018/7/30.
 */

public class ComputerDirector {
    ComputerBuilder mBuild = null;

    public ComputerDirector(ComputerBuilder build) {
        this.mBuild = build;
    }

    public Computer createComputer(String cpu, String mainboard, String ram, String ststem) {
        //规范建造流程，这个顺序是由它定的
        this.mBuild.buildMainBoard(mainboard);
        this.mBuild.buildCpu(cpu);
        this.mBuild.buildRam(ram);
        this.mBuild.buildSystem(ststem);
        return mBuild.create();
    }

}
