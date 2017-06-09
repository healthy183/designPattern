package com.kang.design.strategy.strategyFactoryProxy.impl;

import com.kang.design.strategy.strategyFactory.api.CalPrice;
import com.kang.design.strategy.strategyFactoryProxy.api.OnceValidRegionProxy;
import com.kang.design.strategy.strategyFactoryProxy.api.ValidRegionProxy;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/4.
 * @Author Healthy
 * @Version
 */
@OnceValidRegionProxy(@ValidRegionProxy(min=2000,order=40))
public class TwoDFourHCalPriceProxy implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice -400;
    }
}
