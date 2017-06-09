package com.kang.design.factory.abstractFatory;

import com.kang.design.factory.abstractFatory.api.DiPizza;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/2.
 * @Author Healthy
 * @Version
 */
public class MainRun {

    public static void main(String[] args) {
        DiChangshaStore diChangshaStore = new DiChangshaStore();
        DiPizza diPizza  = diChangshaStore.createPizza();
        diPizza.cook();
    }
}
