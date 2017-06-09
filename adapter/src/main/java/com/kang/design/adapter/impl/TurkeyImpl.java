package com.kang.design.adapter.impl;

import com.kang.design.adapter.api.Turkey;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class TurkeyImpl implements Turkey {
    @Override
    public void gobble() {
        log.info("rurkey gobble!");
    }

    @Override
    public void fly() {
        log.info("rurkey fly!");
    }
}
