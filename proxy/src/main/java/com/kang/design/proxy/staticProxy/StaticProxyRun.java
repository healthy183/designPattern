package com.kang.design.proxy.staticProxy;

import com.kang.design.proxy.staticProxy.api.Duck;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
public class StaticProxyRun {

    public static void main(String[] args) {
        Duck staticProxyDuck = new StaticProxyDuck();
        staticProxyDuck.fly();
    }
}
