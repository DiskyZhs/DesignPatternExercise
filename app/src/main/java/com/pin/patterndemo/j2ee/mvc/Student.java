package com.pin.patterndemo.j2ee.mvc;

/**
 * Model
 * Created by HH on 2018/8/8.
 */

public class Student {
    private String rollNo;
    private String name;
    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}