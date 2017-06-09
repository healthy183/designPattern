package com.kang.design.decorator.simple.coffee;

import com.kang.design.decorator.simple.api.Beverage;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/28.
 * @Author Healthy
 * @Version
 */
public class CatsCoffee extends Beverage {
    @Override
    public String description() {
        return this.getClass().getSimpleName();
    }

    @Override
    public Double cost() {
        return 1.5D;
    }
}
