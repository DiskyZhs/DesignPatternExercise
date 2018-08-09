package com.pin.patterndemo.structural.decorator;

/**
 * 装饰器模式（Decorator Pattern）
 * <p>
 * 意图：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
 * <p>
 * 主要解决：一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。
 * <p>
 * 何时使用：在不想增加很多子类的情况下扩展类。
 * <p>
 * 如何解决：将具体功能职责划分，同时继承装饰者模式。
 * <p>
 * 关键代码： 1、Component 类充当抽象角色，不应该具体实现。 2、修饰类引用和继承 Component 类，具体扩展类重写父类方法
 * <p>
 * 优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
 * <p>
 * 缺点：多层装饰比较复杂。
 * <p>
 * 使用场景： 1、扩展一个类的功能。 2、动态增加功能，动态撤销。
 * <p>
 * 注意事项：可代替继承。
 * <p>
 * <p>
 * PS 个人理解：1.实现方式：Decorator 类持有 src的 抽象实例，并实现src的抽象接口，同时添加自己的新的功能方法，这种情况下其实继承也能完成这些（简单说就是持有src对象的扩展，将继承关系转化为关联，解耦使用）
 * 2.使用场景:1.在不想增加很多子类的情况下扩展类 2.从功能模块上划分，Decorator功能也确实比子类继承更加合适（比如 hero 和 skill 以及 Skin的例子）
 * 3.摘自一段理解：　首先，装饰器的价值在于装饰，他并不影响被装饰类本身的核心功能。在一个继承的体系中，子类通常是互斥的。比如一辆车，品牌只能要么是奥迪、要么是宝马，不可能同时属于奥迪和宝马，而品牌也是一辆车本身的重要属性特征。但当你想要给汽车喷漆，换坐垫，或者更换音响时，这些功能是互相可能兼容的，并且他们的存在不会影响车的核心属性：那就是他是一辆什么车。这时你就可以定义一个装饰器：喷了漆的车。不管他装饰的车是宝马还是奥迪，他的喷漆效果都可以实现。
 * 4.自己常用的wrapper的写法也算是这个
 */

public class DecortatorPatternDemo {

    void  main(){
        CarPaintedWrapper car1 = new CarPaintedWrapper(new BwmCar("BoBo"),"White");
        car1.setPaintedColor("purple");
        car1.run();
    }
}
