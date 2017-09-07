package com.kang.design.chainofResponsibility.simple;

import lombok.Getter;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
public class OrderManager {
    @Getter
    private static OrderManager orderManager = new OrderManager();
    private Subbranch head;
    private Subbranch last;
    private OrderManager(){}

    public static OrderManager getOrderManager(){
        return orderManager;
    }

    public void registerSubbranch(Subbranch... subbranchs){
        for (Subbranch subbranch : subbranchs) {
            registerSubbranch(subbranch);
        }
    }

    public void registerSubbranch(Subbranch subbranch){
        if (head == null) {
            last = head = subbranch;
        }else {
            last.setSuccessor(subbranch);
            last = subbranch;
        }
    }

    public boolean handleOrder(Order order){
        return head.handleOrder(order);
    }



}
