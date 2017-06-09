package com.kang.design.observer.simple.main;

import com.kang.design.observer.simple.impl.JimDisplay;
import com.kang.design.observer.simple.impl.TomDisplay;
import com.kang.design.observer.simple.impl.WeatherDateSubject;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/28.
 * @Author Healthy
 * @Version
 */
public class MainRun {

    public static void main(String[] args) {
        WeatherDateSubject weatherDateSubject = new WeatherDateSubject();
        TomDisplay tomDisplay = new TomDisplay(weatherDateSubject);
        JimDisplay jimDisplay = new JimDisplay(weatherDateSubject);
        weatherDateSubject.setData(1.1F,2.2F,3.2F);
    }
}
