package com.kang.design.observer.simple.impl;

import com.kang.design.observer.simple.api.DisplayElement;
import com.kang.design.observer.simple.api.Observer;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/28.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class TomDisplay implements Observer,DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;

    public TomDisplay(WeatherDateSubject weatherDateSubject){
        weatherDateSubject.registerObserver(this);
    }

    @Override
    public void display() {
        log.info("this is tom,temp:[{}],humidity:[{}]",temp,humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity =humidity;
        this.pressure = pressure;
        display();
    }
}
