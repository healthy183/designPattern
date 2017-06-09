package com.kang.design.observer.simple.api;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/28.
 * @Author Healthy
 * @Version
 */
public interface Observer {
    public void update(float temp,float humidity,float pressure);
}
