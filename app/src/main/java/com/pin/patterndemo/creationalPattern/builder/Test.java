package com.pin.patterndemo.creationalPattern.builder;

/**
 * 意图：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 * <p>
 * 主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
 * <p>
 * 何时使用：一些基本部件不会变，而其组合经常变化的时候。
 * <p>
 * 与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。
 * <p>
 * Mini改:在现实开发中，往往省去Director的角色，而直接使用一个Buider实例来进行对象的组装。(多属性配置以及设置的时候)
 * Created by HH on 2018/7/30.
 */

public class Test {

    void testBuilderPattern() {
        ComputerDirector director = new ComputerDirector(new WomwComputerBuilder());
        Computer c = director.createComputer("i7-2500", "ARM", "金士顿", "Windows");
    }


    /**
     * Mini模式
     * 链式调用
     * 省略Director（当装配顺序不重要时）
     */
    void testMiniBuilderPattern() {
        Computer c = new MiniWomwComputerBuilder()
                .buildCpu("i7-2500")
                .buildMainBoard("ARM")
                .buildRam("Sumgsung")
                .buildSystem("MacOs")
                .create();
    }
}
