package com.kang.design.state;

import com.kang.design.state.api.Mystate;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class MainRun {

    public static void main(String[] args) {
        Sportsman sportsman = new Sportsman();
        sportsman.launch();
        sportsman.comment();
        sportsman.summary();
        Mystate mystate  = sportsman.getThisState();
        log.info(mystate.toString());
    }
}
