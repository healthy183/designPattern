package com.kang.design.observer.simple.impl;

import com.kang.design.observer.simple.api.Observer;
import com.kang.design.observer.simple.api.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/28.
 * @Author Healthy
 * @Version
 */
public class WeatherDateSubject implements Subject {

    List<Observer> observers = new ArrayList<Observer>();
    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(temp,humidity,pressure);
        }
    }

    public void setData(float temp,float humidity,float pressure){
        this.temp = temp;
        this.humidity =humidity;
        this.pressure = pressure;
        notifyObserver();
    }

}
