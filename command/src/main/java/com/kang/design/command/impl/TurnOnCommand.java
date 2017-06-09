package com.kang.design.command.impl;

import com.kang.design.command.api.Command;
import com.kang.design.command.api.Light;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/2.
 * @Author Healthy
 * @Version
 */
public class TurnOnCommand implements Command {

    private Light light;

    public  TurnOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
