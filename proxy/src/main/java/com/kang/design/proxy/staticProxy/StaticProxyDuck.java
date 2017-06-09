package com.kang.design.proxy.staticProxy;

import com.kang.design.proxy.staticProxy.api.Duck;
import com.kang.design.proxy.staticProxy.impl.BigDuck;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
public class StaticProxyDuck implements Duck {

    private final Duck bigDuck = new  BigDuck();

    @Override
    public void fly() {
        bigDuck.fly();
    }
}
