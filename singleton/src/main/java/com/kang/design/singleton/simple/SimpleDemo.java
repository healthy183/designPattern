package com.kang.design.singleton.simple;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/2.
 * @Author Healthy
 * @Version
 */
public class SimpleDemo {

    private static volatile SimpleDemo simpleDemo;

    public  static  SimpleDemo getInstance(){
        if(simpleDemo == null){
            synchronized (SimpleDemo.class){
                if(simpleDemo == null){
                    simpleDemo = new  SimpleDemo();
                }
            }
        }
        return simpleDemo;
    }

}
