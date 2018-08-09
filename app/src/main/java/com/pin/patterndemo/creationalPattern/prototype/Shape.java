package com.pin.patterndemo.creationalPattern.prototype;

/**
 * 注意Clone方法是浅拷贝，区分浅拷贝和深拷贝
 * Created by HH on 2018/7/31.
 */

public abstract class Shape implements Cloneable{

    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
