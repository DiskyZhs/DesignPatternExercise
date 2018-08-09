package com.pin.patterndemo.creationalPattern.builder;

/**
 * Product Bean
 * Product：要创建的复杂对象，产品类
 * Created by HH on 2018/7/30.
 */

public class Computer {
    private String cpu;
    private String mainBoard;
    private String ram;
    private String system;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }
}
