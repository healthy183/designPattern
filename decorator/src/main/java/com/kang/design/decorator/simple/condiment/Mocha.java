package com.kang.design.decorator.simple.condiment;

import com.kang.design.decorator.simple.api.Beverage;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/28.
 * @Author Healthy
 * @Version
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public  String description(){
        return "Mocha + "+getBeverage().description();
    };

    @Override
    public Double cost() {
        return getBeverage().cost() + 5.3D;
    }
}
