package com.kang.design.decorator.simple.api;

import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/28.
 * @Author Healthy
 * @Version
 */
@Slf4j
public abstract class Beverage {

    public abstract String description();
    public abstract Double cost();
}
