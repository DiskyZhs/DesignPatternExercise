package com.pin.patterndemo.structural.proxy;

/**
 * 代理模式（Proxy Pattern）
 * <p>
 * 意图：为其他对象提供一种代理以控制对这个对象的访问。
 * <p>
 * 主要解决：在直接访问对象时带来的问题，比如说：要访问的对象在远程的机器上。在面向对象系统中，有些对象由于某些原因（比如对象创建开销很大，或者某些操作需要安全控制，或者需要进程外的访问），直接访问会给使用者或者系统结构带来很多麻烦，我们可以在访问此对象时加上一个对此对象的访问层。
 * <p>
 * 何时使用：想在访问一个类时做一些控制。
 * <p>
 * 如何解决：增加中间层。
 * <p>
 * 关键代码：实现与被代理类组合。
 * <p>
 * 优点： 1、职责清晰。 2、高扩展性。 3、智能化。
 * <p>
 * 缺点： 1、由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢。 2、实现代理模式需要额外的工作，有些代理模式的实现非常复杂。
 * <p>
 * 注意事项： 1、和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。 2、和装饰器模式的区别：装饰器模式为了增强功能，而代理模式是为了加以控制。
 * <p>
 * PS :代理模式中，代理类对被代理的对象有控制权，决定其执行或者不执行。而装饰模式中，装饰类对代理对象没有控制权，只能为其增加一层装饰，以加强被装饰对象的功能，仅此而已。
 * 　代理模式使用到极致开发就是AOP， 这是各位采用Spring架构开发必然要使用到的技术(Spring学习之第一个AOP程序)，它就是使用了代理和反射的技术。
 * <p>
 * PS2:一般情况下要求代理对象也实现Src对象的接口，JAVA中可以基于java.lang.reflect.Proxy中newProxyInstance 方法来自己进行代理而不必
 * <p>
 * PS3:代理模式可以做一些方法的拦截和处理 （多用于对于第三方，不方便自己处理的改造，特别是动态代理）,如果是自己要做多层拦截，显然使用chain，责任链模式进行多层设计（自定义添加拦截）
 */

public class ProxyPatternDemo {

    /**
     * 普通的Normal的静态代理，要求代理类必须实现DST的接口
     */
    void testNormalProxy() {
        IUserDao dao = new UserDao();
        UserDaoProxy userProxy = new UserDaoProxy(dao);
        userProxy.save("66666", "No89757");
        userProxy.find("66666");
    }


    /**
     * 动态代理，代理类不必实现DST的接口
     */
    void testDynamicProxy() {
        IUserDao dao = new UserDao();
        UserDaoDynamicProxy daoDynamicProxy = new UserDaoDynamicProxy(dao);
        IUserDao proxy = daoDynamicProxy.getDaoProxy();
        proxy.save("66666", "No89757");
        proxy.find("66666");
    }
}
