package com.kang.desgin.visitor.simple;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
public abstract class AbstractViewer  implements Viewer {

    //查看消费的单子
    abstract void viewConsumeBill(ConsumeBill bill);

    //查看收入的单子
    abstract void viewIncomeBill(IncomeBill bill);

    public final void viewAbstractBill(AbstractBill bill){}

}
