package com.kang.desgin.visitor.simple;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
public class Client {

    public static void main(String[] args) {

        AccountBook accountBook = new AccountBook();
        //添加两条收入
        accountBook.addBill(new IncomeBill(10000, "卖商品"));
        accountBook.addBill(new IncomeBill(12000, "卖广告位"));
        //添加两条支出
        accountBook.addBill(new ConsumeBill(1000, "工资"));
        accountBook.addBill(new ConsumeBill(2000, "材料费"));

        Viewer boss = new Boss();
        Viewer cpa = new CPA();
        Viewer cfo = new CFO();

        //两个访问者分别访问账本
        accountBook.show(cpa);
        accountBook.show(boss);
        accountBook.show(cfo);

        ((Boss) boss).getTotalConsume();
        ((Boss) boss).getTotalIncome();

    }
}
