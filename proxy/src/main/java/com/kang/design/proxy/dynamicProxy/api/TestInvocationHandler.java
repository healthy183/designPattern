package com.kang.design.proxy.dynamicProxy.api;

import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
@AllArgsConstructor
public class TestInvocationHandler implements InvocationHandler {

    private Object source;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(source,args);
    }

    public  TestInterface getProxy(){
        return (TestInterface) Proxy.newProxyInstance
                (Thread.currentThread().getContextClassLoader(),
                        source.getClass().getInterfaces(),
                this);
    }

}
