package com.kang.design.proxy.dynamicProxy.api;

import com.google.common.base.Throwables;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class DynamicRun {

    public static void main(String[] args) {
        DynamicRun dynamicRun = new DynamicRun();
        dynamicRun.testRun();
    }

    public void testRun(){
        try{
            TestInterfaceImpl testInterface = new TestInterfaceImpl();
            TestInvocationHandler testInvocationHandler = new TestInvocationHandler(testInterface);
            TestInterface proxyInterface = testInvocationHandler.getProxy();
            proxyInterface.method1();
        }catch(Exception e){
            log.info(Throwables.getStackTraceAsString(e));
        }
    }
}
