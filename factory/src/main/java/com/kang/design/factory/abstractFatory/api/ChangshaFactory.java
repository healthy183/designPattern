package com.kang.design.factory.abstractFatory.api;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/2.
 * @Author Healthy
 * @Version
 */
public class ChangshaFactory implements PizzaFactory {

    @Override
    public String getFood() {
        return "noodle";
    }

    @Override
    public String getCondiment() {
        return "chili";
    }
}
