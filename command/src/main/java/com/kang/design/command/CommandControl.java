package com.kang.design.command;

import com.kang.design.command.api.Command;
import lombok.Setter;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/2.
 * @Author Healthy
 * @Version
 */
public class CommandControl {
    @Setter
    private Command command;

    public void executeCommand(){
        command.execute();
    }


}
