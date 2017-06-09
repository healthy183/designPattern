package com.kang.design.decorator.simple.main;

import com.kang.design.decorator.simple.coffee.CatsCoffee;
import com.kang.design.decorator.simple.condiment.Milk;
import com.kang.design.decorator.simple.condiment.Mocha;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/28.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class MainRun {

    public static void main(String[] args) {
        CatsCoffee catsCoffee  = new CatsCoffee();
        Milk milk = new Milk(catsCoffee);
        Mocha mocha = new Mocha(milk);
        log.info("[{}] cost [{}]",mocha.description(),  mocha.cost());
    }
}
