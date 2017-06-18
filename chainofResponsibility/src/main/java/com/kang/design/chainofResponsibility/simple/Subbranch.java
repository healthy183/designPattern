package com.kang.design.chainofResponsibility.simple;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
public interface Subbranch {

    void setSuccessor(Subbranch subbranch);

    boolean handleOrder(Order order);
}
