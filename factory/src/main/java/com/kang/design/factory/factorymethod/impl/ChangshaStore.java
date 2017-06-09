package com.kang.design.factory.factorymethod.impl;

import com.kang.design.factory.factorymethod.api.Pizza;
import com.kang.design.factory.factorymethod.api.Store;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/31.
 * @Author Healthy
 * @Version
 */
public class ChangshaStore extends Store {
    @Override
    protected Pizza createPizza(String condimentType) {
        Pizza pizza = null;
        switch (condimentType){
            case "chili":
                pizza = new ChangshaPizza(condimentType);
                break;
            default:
                pizza = new DefaultPizza("defaultCondiment");
                break;
        }
        return pizza;
    }
}
