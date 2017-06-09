package com.kang.design.observer.simple.api;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/28.
 * @Author Healthy
 * @Version
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}
