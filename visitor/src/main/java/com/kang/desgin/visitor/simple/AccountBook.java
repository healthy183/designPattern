package com.kang.desgin.visitor.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
public class AccountBook {

    //单子列表
    private List<Bill> billList = new ArrayList<Bill>();
    //添加单子
    public void addBill(Bill bill){
        billList.add(bill);
    }
    //供账本的查看者查看账本
    public void show(Viewer viewer){
        for (Bill bill : billList) {
            bill.accept(viewer);
        }
    }
}
