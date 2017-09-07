package com.kang.desgin.visitor.simple;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
public class IncomeBill  extends AbstractBill {

    public IncomeBill(double amount, String item) {
        super(amount, item);
    }

    public void accept(Viewer viewer) {
        if (viewer instanceof AbstractViewer) {
            ((AbstractViewer)viewer).viewIncomeBill(this);
            return;
        }
        viewer.viewAbstractBill(this);
    }
}
