package com.kang.design.state.impl;

import com.kang.design.state.Sportsman;
import com.kang.design.state.api.Mystate;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
@AllArgsConstructor
@ToString
@Slf4j
public class EndState implements Mystate {
    private Sportsman sportsman;

    @Override
    public void start() {
    }

    @Override
    public void running() {
    }

    @Override
    public void end() {
        log.info("ending!");
        sportsman.setThisState(sportsman.getStartState());
    }
}
