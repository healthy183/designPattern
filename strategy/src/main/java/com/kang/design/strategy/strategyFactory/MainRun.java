package com.kang.design.strategy.strategyFactory;

import com.kang.design.strategy.strategyFactory.component.Customer;
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
        Customer customer = new Customer();
         customer.buy(2000D);
        Double cost = customer.calLastAmount();
        log.info(""+cost);
    }
}
