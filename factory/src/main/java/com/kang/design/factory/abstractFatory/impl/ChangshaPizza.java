package com.kang.design.factory.abstractFatory.impl;

import com.kang.design.factory.abstractFatory.api.DiPizza;
import com.kang.design.factory.abstractFatory.api.PizzaFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/2.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class ChangshaPizza extends DiPizza {

    public ChangshaPizza(PizzaFactory pizzaFactory) {
        super(pizzaFactory);
    }

    public void  cook(){
        String food = getPizzaFactory().getFood();
        String condiment =  getPizzaFactory().getCondiment();
        log.info("ChangshaPizza with {} and {}",food,condiment);
    }


}
