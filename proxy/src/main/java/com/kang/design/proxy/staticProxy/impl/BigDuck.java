package com.kang.design.proxy.staticProxy.impl;

import com.kang.design.proxy.staticProxy.api.Duck;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class BigDuck implements Duck {
    @Override
    public void fly() {
       log.info("big duck is flying!");
    }
}
