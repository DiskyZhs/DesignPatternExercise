package com.pin.patterndemo.structural.adapter;

/**
 * 适配器模式
 * <p>
 * 意图：将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * <p>
 * 主要解决：主要解决在软件系统中，常常要将一些"现存的对象"放到新的环境中，而新环境要求的接口是现对象不能满足的。
 * <p>
 * <p>
 * <p>
 * PS:
 * 我个人理解，三种命名方式，是根据 src是以怎样的形式给到Adapter（在Adapter里的形式）来命名的。
 * 类适配器，以类给到，在Adapter里，就是将src当做类，继承，
 * 对象适配器，以对象给到，在Adapter里，将src作为一个对象，持有。
 * 接口适配器，以接口给到，在Adapter里，将src作为一个接口，实现。
 * <p>
 * Adapter模式最大的作用还是将原本不兼容的接口融合在一起工作。
 * 但是在实际开发中，实现起来不拘泥于本文介绍的三种经典形式，
 * 例如Android中ListView、GridView的适配器Adapter，就不是以上三种经典形式之一，
 * 我个人理解其属于对象适配器模式，一般日常使用中，我们都是在Adapter里持有datas，然后通过getView()/onCreateViewHolder()方法向ListView/RecyclerView提供View/ViewHolder。
 * <p>
 * Client是Lv Gv Rv ，它们是显示View的类。
 * 所以dst(Target)是View。
 * 一般来说我们有的src是数据datas，
 * 即，我们希望：datas（src）->Adapter->View(dst)->Rv(Client)。
 * <p>
 * 详见:https://blog.csdn.net/zxt0601/article/details/52848004
 * <p>
 * 个人理解：对象适配器以及接口适配器比较常见，持有对src Data的引用，转换为可以用来被Dst所使用 ，DSt.setSrc变为Dst.setAdapter
 */

public class AdapterPatternDemo {
}
