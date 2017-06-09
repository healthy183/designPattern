package com.kang.design.strategy.strategyFactoryProxy;

import com.kang.design.strategy.strategyFactoryProxy.component.CustomerProxy;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/4.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class MainRun {

    public static void main(String[] args) {
        CustomerProxy customerProxy  = new CustomerProxy();
        customerProxy.buy(2000D);
        Double cost = customerProxy.calLastAmount();
        log.info("cost:{}",cost);
    }
}
