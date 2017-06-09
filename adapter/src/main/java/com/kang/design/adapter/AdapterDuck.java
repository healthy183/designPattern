package com.kang.design.adapter;

import com.kang.design.adapter.api.Duck;
import com.kang.design.adapter.api.Turkey;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
public class AdapterDuck  implements Duck {

    private Turkey turkey;

    public AdapterDuck(Turkey turkey){
        this.turkey =  turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
