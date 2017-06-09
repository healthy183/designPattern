package com.kang.design.strategy.strategyFactory.impl;

import com.kang.design.strategy.strategyFactory.api.CalPrice;
import com.kang.design.strategy.strategyFactory.api.TotalValidRegion;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/4.
 * @Author Healthy
 * @Version
 */
@TotalValidRegion(min=1000,max=2000)
public class VipCalPrice implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice*0.8;
    }
}
