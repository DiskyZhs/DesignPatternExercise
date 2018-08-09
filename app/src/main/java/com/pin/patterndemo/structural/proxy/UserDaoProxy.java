package com.pin.patterndemo.structural.proxy;

import android.util.Log;

/**
 * 基本的静态的Proxy类
 * Created by HH on 2018/8/1.
 */

public class UserDaoProxy implements IUserDao {
    private IUserDao dao;

    public UserDaoProxy(IUserDao dao) {
        this.dao = dao;
    }

    @Override
    public void save(String key, String value) {
        if (dao != null) {
            Log.e("UserDaoProxy", "will go to save key to Dao ，you can handle someThing there");
            dao.save(key, value);
        }
    }

    @Override
    public String find(String key) {
        if (dao != null) {
            Log.e("UserDaoProxy", "will go to find key to Dao ，you can handle someThing there");
            return dao.find(key);
        }
        return null;
    }
}
