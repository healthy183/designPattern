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
@TotalValidRegion(min=2000,max=3000)
public class SuperVipCalPrice implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice*0.6;
    }
}
