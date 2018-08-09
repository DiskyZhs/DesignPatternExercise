package com.pin.patterndemo.structural.proxy;

/**
 * Created by HH on 2018/8/1.
 */

public interface IUserDao {

    void save(String key,String value);

    String find(String key);
}
