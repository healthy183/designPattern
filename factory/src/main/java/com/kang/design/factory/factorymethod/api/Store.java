package com.kang.design.factory.factorymethod.api;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/31.
 * @Author Healthy
 * @Version
 */
public abstract class Store {

    public Pizza order(String pizzaName){
        Pizza pizza = createPizza(pizzaName);
        pizza.prepare();
        pizza.finish();
        return pizza;
    }

    protected abstract Pizza createPizza(String pizzaName);

}
