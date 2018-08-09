package com.pin.patterndemo.behavioral.command;

import com.pin.patterndemo.behavioral.command.order.BuyStock;
import com.pin.patterndemo.behavioral.command.order.SellStock;

/**
 * 命令模式（Command Pattern）
 * <p>
 * 意图：将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化。
 * <p>
 * 主要解决：在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
 * <p>
 * 何时使用：在某些场合，比如要对行为进行"记录、撤销/重做、事务"等处理，这种无法抵御变化的紧耦合是不合适的。在这种情况下，如何将"行为请求者"与"行为实现者"解耦？将一组行为抽象为对象，可以实现二者之间的松耦合。
 * <p>
 * 关键代码：定义三个角色：1、received 真正的命令执行对象 2、Command 3、invoker 使用命令对象的入口
 * <p>
 * 注意事项：系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作，也可以考虑使用命令模式，见命令模式的扩展。
 * <p>
 * PS：个人理解：1.将"行为请求者"与"行为实现者"解耦 或者 系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作 时候使用
 * 2.创建Command，以及操作记录分配commend的invoker类，received类为实际被操作的对象
 * 3.和观察者模式要进行对比一下（由于有rxjava和eventBus的存在，也会存在指令的分发，其实并不是一回事，那个是观察者模式）（个人感觉最大的区别在于Command的指令类包含的对recived类的实现）
 */

public class CommandPatternDemo {

    void testCommandPattern() {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
