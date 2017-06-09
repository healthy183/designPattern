package com.kang.design.strategy.strategyFactoryProxy.impl;

import com.kang.design.strategy.strategyFactory.api.CalPrice;
import com.kang.design.strategy.strategyFactoryProxy.api.TotalValidRegionProxy;
import com.kang.design.strategy.strategyFactoryProxy.api.ValidRegionProxy;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/4.
 * @Author Healthy
 * @Version
 */
@TotalValidRegionProxy(@ValidRegionProxy(min=2000,max=3000,order=99))
public class SuperVipCalPriceProxy implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice*0.7;
    }
}
