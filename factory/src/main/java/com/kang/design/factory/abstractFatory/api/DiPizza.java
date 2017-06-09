package com.kang.design.factory.abstractFatory.api;

import lombok.Getter;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/2.
 * @Author Healthy
 * @Version
 */
public  abstract  class DiPizza {

    @Getter
    private PizzaFactory  pizzaFactory;
    public DiPizza(PizzaFactory  pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }
    public  abstract  void  cook();;
}
