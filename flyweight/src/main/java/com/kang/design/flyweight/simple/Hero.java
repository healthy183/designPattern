package com.kang.design.flyweight.simple;

import lombok.AllArgsConstructor;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
@AllArgsConstructor
public  abstract  class Hero {

    private String name;

    public  abstract  void kill();
}
