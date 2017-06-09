package com.kang.design.adapter.impl;

import com.kang.design.adapter.api.Duck;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class DuckImpl implements Duck {
    @Override
    public void quack() {
        log.info("Duck quack!");
    }

    @Override
    public void fly() {
        log.info("Duck fly!");
    }
}
