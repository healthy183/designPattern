package com.kang.design.factory.factorymethod.api;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/31.
 * @Author Healthy
 * @Version
 */
@Slf4j
public abstract class Pizza {

    @Getter
    private String condiment;

    public Pizza(String condiment) {
        this.condiment = condiment;
    }

    public void prepare(){
        log.info("[{}] had ready!", condiment);
    }

    public abstract void finish();
}
