package com.kang.design.decorator.simple.condiment;

import com.kang.design.decorator.simple.api.Beverage;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/28.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }
    @Override
    public  String description(){
        return "milk + "+getBeverage().description();
    };

    @Override
    public Double cost() {
        return getBeverage().cost() + 3.3D;
    }
}
