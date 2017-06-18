package com.kang.desgin.visitor.simple;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
public class CFO  implements Viewer {

    //财务主管对每一个单子都要核对项目和金额
    public void viewAbstractBill(AbstractBill bill) {
        System.out.println("财务主管查看账本时，每一个都核对项目和金额，金额是" + bill.getAmount() + "，项目是" + bill.getItem());
    }
}
