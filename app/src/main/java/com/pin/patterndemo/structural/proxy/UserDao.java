package com.pin.patterndemo.structural.proxy;

import android.util.Log;

import java.util.HashMap;

/**
 * Created by HH on 2018/8/1.
 */

public class UserDao implements IUserDao {
    private HashMap<String,String> map = new HashMap<>();

    @Override
    public void save(String key, String value) {
        Log.e("UserDao", "You have save  " + key + " to Dao ! the key is " + value);
        map.put(key, value);
    }

    @Override
    public String find(String key) {
        Log.e("UserDao", "You have find " + key + ": " + map.get(key));
        return  map.get(key);
    }
}
