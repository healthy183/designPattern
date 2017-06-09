package com.kang.design.proxy.dynamicProxy.api;

import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class TestInterfaceImpl implements TestInterface {
    @Override
    public void method1() {
        //log.info("{} method1",TestInterfaceImpl.class.getSimpleName());
        log.info("method1");
    }

    @Override
    public void method2() {
        log.info("{} method2",TestInterfaceImpl.class.getSimpleName());
    }

    @Override
    public void method3() {
        log.info("{} method3",TestInterfaceImpl.class.getSimpleName());
    }
}
