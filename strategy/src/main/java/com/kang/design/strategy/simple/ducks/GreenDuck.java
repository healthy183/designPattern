package com.kang.design.strategy.simple.ducks;

import com.kang.design.strategy.simple.abstractClazz.AbstractDuck;
import com.kang.design.strategy.simple.api.FlyBehavior;
import com.kang.design.strategy.simple.api.QuackBehavior;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/27.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class GreenDuck extends AbstractDuck {

    public GreenDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super();
        super.flyBehavior = flyBehavior;
        super.quackBehavior = quackBehavior;
    }
    @Override
    public void introduce() {
        log.info("i am red green!");
    }
}
