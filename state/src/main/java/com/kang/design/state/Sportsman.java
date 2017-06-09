package com.kang.design.state;

import com.kang.design.state.api.Mystate;
import com.kang.design.state.impl.EndState;
import com.kang.design.state.impl.RunningState;
import com.kang.design.state.impl.StartState;
import lombok.Getter;
import lombok.Setter;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
public class Sportsman {
    @Setter
    @Getter
    private  Mystate thisState;
    @Getter
    private final Mystate startState;
    @Getter
    private final Mystate runningSTate;
    @Getter
    private final Mystate endState;

    public Sportsman(){
        startState = new StartState(this);
        runningSTate = new RunningState(this);
        endState = new EndState(this);
        setThisState(startState);
    }

    public void  launch(){
        thisState.start();
    }

    public void   comment(){
        thisState.running();
    }

    public  void  summary(){
        thisState.end();
    }




}
