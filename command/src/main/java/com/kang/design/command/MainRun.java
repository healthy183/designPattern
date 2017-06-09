package com.kang.design.command;

import com.kang.design.command.api.Command;
import com.kang.design.command.api.Light;
import com.kang.design.command.impl.TurnOnCommand;
import com.kang.design.command.impl.TurnOnLight;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/2.
 * @Author Healthy
 * @Version
 */
public class MainRun {

    public static void main(String[] args) {
        Light light = new TurnOnLight();
        Command command = new TurnOnCommand(light);
        CommandControl commandControl = new CommandControl();
        commandControl.setCommand(command);
        commandControl.executeCommand();
    }

}
