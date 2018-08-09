package com.pin.patterndemo.structural.proxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 基本的静态的Proxy类
 * Created by HH on 2018/8/1.
 */

public class UserDaoDynamicProxy {
    private IUserDao dao;

    public UserDaoDynamicProxy(IUserDao dao) {
        this.dao = dao;
    }

    public IUserDao getDaoProxy() {
        return (IUserDao) Proxy.newProxyInstance(
                dao.getClass().getClassLoader(),
                dao.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        if (method.getName().equals("save")) {
                            Log.e("UserDaoDynamicProxy", "will go to save key to Dao ，you can handle someThing there");
                        }
                        //如果调用的是代理对象的dance方法
                        if (method.getName().equals("find")) {
                            Log.e("UserDaoDynamicProxy", "will go to find key to Dao ，you can handle someThing there");
                        }
                        return method.invoke(dao, args);
                    }
                }
        );
    }

}
