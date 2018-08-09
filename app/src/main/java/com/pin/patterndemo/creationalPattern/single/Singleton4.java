package com.pin.patterndemo.creationalPattern.single;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * JDK 版本：JDK1.5 起
 * <p>
 * 是否 Lazy 初始化：是
 * <p>
 * 是否多线程安全：是
 * <p>
 * 实现难度：较复杂
 * <p>
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 * <p>
 * PS:为什么使用volatile，详见解释https://blog.csdn.net/li295214001/article/details/48135939/ 与 https://blog.csdn.net/yt4766269/article/details/53496301
 */

public class Singleton4 {

    private static volatile Singleton4 instance;

    public static Singleton4 getInstance() {
        if (instance == null) { //volatile 如果不添加，可能在这一步得到一个没有执行构造函数的instance
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }

        return instance;
    }

}
