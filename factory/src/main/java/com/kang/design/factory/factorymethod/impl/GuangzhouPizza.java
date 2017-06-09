package com.kang.design.factory.factorymethod.impl;

import com.kang.design.factory.factorymethod.api.Pizza;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/31.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class GuangzhouPizza extends Pizza {

    public GuangzhouPizza(String condiment){
        super(condiment);
    }

    @Override
    public void finish() {
        log.info("guangzhouPizza had finished after add {}!",getCondiment());
    }
}
