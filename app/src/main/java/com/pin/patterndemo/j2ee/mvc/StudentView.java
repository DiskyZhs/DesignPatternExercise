package com.pin.patterndemo.j2ee.mvc;

/**
 * View
 * Created by HH on 2018/8/8.
 */

public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}