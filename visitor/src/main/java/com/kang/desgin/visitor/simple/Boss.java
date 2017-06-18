package com.kang.desgin.visitor.simple;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
public class Boss  extends AbstractViewer {

    private double totalIncome;
    private double totalConsume;

    //老板只关注一共花了多少钱以及一共收入多少钱，其余并不关心
    public void viewConsumeBill(ConsumeBill bill) {
        totalConsume += bill.getAmount();
    }

    public void viewIncomeBill(IncomeBill bill) {
        totalIncome += bill.getAmount();
    }

    public double getTotalIncome() {
        System.out.println("老板查看一共收入多少，数目是：" + totalIncome);
        return totalIncome;
    }

    public double getTotalConsume() {
        System.out.println("老板查看一共花费多少，数目是：" + totalConsume);
        return totalConsume;
    }
}
