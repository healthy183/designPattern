package com.kang.design.state.impl;

import com.kang.design.state.Sportsman;
import com.kang.design.state.api.Mystate;
import lombok.AllArgsConstructor;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
@AllArgsConstructor
public class StartState implements Mystate {
    private Sportsman sportsman;
    @Override
    public void start() {
        sportsman.setThisState(sportsman.getRunningSTate());
    }

    @Override
    public void running() {

    }

    @Override
    public void end() {

    }
}
