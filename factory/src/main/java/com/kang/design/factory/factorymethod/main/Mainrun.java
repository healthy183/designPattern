package com.kang.design.factory.factorymethod.main;

import com.kang.design.factory.factorymethod.impl.ChangshaStore;
import com.kang.design.factory.factorymethod.impl.GuangzhouStore;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/5/31.
 * @Author Healthy
 * @Version
 */
public class Mainrun {

    public static void main(String[] args) {
        ChangshaStore changshaStore  = new ChangshaStore();
        GuangzhouStore guangzhouStore  = new GuangzhouStore();
        changshaStore.order("chili");
        guangzhouStore.order("sugar");
        guangzhouStore.order("abc");
    }
}
