package com.pin.patterndemo.creationalPattern.builder;

/**
 * Builder
 * Builder：给出一个抽象接口或抽象类，以规范产品的建造。这个接口规定要实现复杂对象的哪些部分的创建，并不涉及具体的对象部件的创建，一般由子类具体实现。
 * <p>
 * Mini改造：符合链式调用
 * Created by HH on 2018/7/30.
 */

public interface MiniComputerBuilder {
    MiniComputerBuilder buildCpu(String cpu);

    MiniComputerBuilder buildMainBoard(String mainBoard);

    MiniComputerBuilder buildRam(String ram);

    MiniComputerBuilder buildSystem(String system);

    Computer create();
}
