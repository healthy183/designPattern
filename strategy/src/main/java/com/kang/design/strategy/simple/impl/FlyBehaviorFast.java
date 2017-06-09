package com.kang.design.strategy.simple.impl;

import com.kang.design.strategy.simple.api.FlyBehavior;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/26.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class FlyBehaviorFast implements FlyBehavior {
    @Override
    public void fly() {
        log.info("fly very fast!");
    }
}
