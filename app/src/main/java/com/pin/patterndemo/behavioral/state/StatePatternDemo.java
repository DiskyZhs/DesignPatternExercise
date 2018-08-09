package com.pin.patterndemo.behavioral.state;

/**
 * 状态模式（State Pattern）
 * <p>
 * 意图：允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。
 * <p>
 * 主要解决：对象的行为依赖于它的状态（属性），并且可以根据它的状态改变而改变它的相关行为。
 * <p>
 * 何时使用：代码中包含大量与对象状态有关的条件语句。
 * <p>
 * 如何解决：将各种具体的状态类抽象出来。
 * <p>
 * 关键代码：通常命令模式的接口中只有一个方法。而状态模式的接口中有一个或者多个方法。而且，状态模式的实现类的方法，一般返回值，或者是改变实例变量的值。也就是说，状态模式一般和对象的状态有关。实现类的方法有不同的功能，覆盖接口中的方法。状态模式和命令模式一样，也可以用于消除 if...else 等条件选择语句。
 * <p>
 * 使用场景： 1、行为随状态改变而改变的场景。 2、条件、分支语句的代替者。
 * <p>
 * PS:实现：将state与实现封装成State类，封装Context类来管理和赋予state （和Command模式有相似的地方，命令模式是將指令和操作封装在一起了，区别在于封装的侧重面）
 */

public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();
        context.start();
        context.pause();
        context.resume();
        context.stop();
        System.out.println(context.getState().toString());
    }
}
