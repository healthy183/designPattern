package com.kang.desgin.visitor.simple;

import lombok.Getter;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
@Getter
public  abstract  class AbstractBill implements Bill {

    protected double amount;

    protected String item;

    public AbstractBill(double amount, String item) {
        super();
        this.amount = amount;
        this.item = item;
    }
}
