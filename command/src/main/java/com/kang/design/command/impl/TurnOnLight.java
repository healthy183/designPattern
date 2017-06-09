package com.kang.design.command.impl;

import com.kang.design.command.api.Light;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/2.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class TurnOnLight  implements Light {

    @Override
    public void on() {
        log.info("light on!");
    }
}
