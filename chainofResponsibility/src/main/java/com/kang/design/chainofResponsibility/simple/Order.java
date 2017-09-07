package com.kang.design.chainofResponsibility.simple;

import lombok.Data;

import java.util.Map;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
@Data
public class Order {

    private int x;
    private int y;
    private Map<String, Integer> order;

    public Order(int x, int y, Map<String, Integer> order) {
        super();
        this.x = x;
        this.y = y;
        this.order = order;
    }
}
