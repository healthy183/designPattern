package com.kang.design.decorator.simple.condiment;

import com.kang.design.decorator.simple.api.Beverage;
import lombok.Getter;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/28.
 * @Author Healthy
 * @Version
 */
public abstract class CondimentDecorator extends Beverage {
    @Getter
    private  Beverage beverage;

    public CondimentDecorator(Beverage beverage){
        this.beverage = beverage;
    }

}
