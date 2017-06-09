package com.kang.design.strategy.simple.impl;

import com.kang.design.strategy.simple.api.QuackBehavior;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/27.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class QuackBehaviorLoudly implements QuackBehavior {
    @Override
    public void quack() {
        log.info("quack loudly!");
    }
}
