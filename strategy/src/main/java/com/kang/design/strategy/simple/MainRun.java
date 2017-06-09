package com.kang.design.strategy.simple;

import com.kang.design.strategy.simple.abstractClazz.AbstractDuck;
import com.kang.design.strategy.simple.api.FlyBehavior;
import com.kang.design.strategy.simple.api.QuackBehavior;
import com.kang.design.strategy.simple.ducks.GreenDuck;
import com.kang.design.strategy.simple.impl.FlyBehaviorFast;
import com.kang.design.strategy.simple.impl.FlyBehaviorSlow;
import com.kang.design.strategy.simple.impl.QuackBehaviorLoudly;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/27.
 * @Author Healthy
 * @Version
 */
public class MainRun {

    public static void main(String[] args) {
        FlyBehavior flyBehavior = new FlyBehaviorFast();
        QuackBehavior quackBehavior = new QuackBehaviorLoudly();
        //constitute object 组合对象
        AbstractDuck duck = new GreenDuck(flyBehavior,quackBehavior);
        duck.introduce();
        duck.quack();
        duck.fly();
        duck.swim();;
        //change one object;
        duck.setFlyBehavior(new FlyBehaviorSlow());
        duck.fly();
    }
}
