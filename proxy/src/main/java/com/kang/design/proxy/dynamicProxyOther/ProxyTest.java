package com.kang.design.proxy.dynamicProxyOther;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
public class ProxyTest {

    public static void main(String[] args) {
        ProxyTest proxyTest = new ProxyTest();
        proxyTest.run();
    }

    public void run(){
        UserService userService = new UserServiceImpl();
        MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);
        UserService proxy = (UserService) invocationHandler.getProxy();
        proxy.add();
    }
}
