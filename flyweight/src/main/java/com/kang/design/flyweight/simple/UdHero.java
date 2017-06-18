package com.kang.design.flyweight.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class UdHero extends Hero {
    public UdHero(String name) {
        super(name);
    }

    @Override
    public void kill() {
        log.info("udHero kill!");
    }
}
