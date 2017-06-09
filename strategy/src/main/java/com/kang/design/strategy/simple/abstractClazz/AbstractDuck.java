package com.kang.design.strategy.simple.abstractClazz;

import com.kang.design.strategy.simple.api.FlyBehavior;
import com.kang.design.strategy.simple.api.QuackBehavior;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/26.
 * @Author Healthy
 * @Version
 */
@Slf4j
public abstract class AbstractDuck {
    @Setter
    protected FlyBehavior flyBehavior;
    @Setter
    protected QuackBehavior quackBehavior;

    public  void swim(){
        log.info("duck can swiming");
    }

    public abstract void introduce();

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }
}
