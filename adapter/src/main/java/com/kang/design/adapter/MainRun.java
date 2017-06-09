package com.kang.design.adapter;

import com.kang.design.adapter.api.Duck;
import com.kang.design.adapter.api.Turkey;
import com.kang.design.adapter.impl.DuckImpl;
import com.kang.design.adapter.impl.TurkeyImpl;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
public class MainRun {


    public static void main(String[] args) {
        Turkey turkey = new TurkeyImpl();
        Duck adapterDuck = new AdapterDuck(turkey);
        Duck duck = new DuckImpl();
        MainRun mainRun = new MainRun();
        mainRun.testAdapter(duck);
        mainRun.testAdapter(adapterDuck);
    }

    public void testAdapter(Duck duck){
        duck.fly();
        duck.quack();
    }

}
