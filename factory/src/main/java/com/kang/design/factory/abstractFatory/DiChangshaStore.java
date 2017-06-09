package com.kang.design.factory.abstractFatory;

import com.kang.design.factory.abstractFatory.api.ChangshaFactory;
import com.kang.design.factory.abstractFatory.api.DiPizza;
import com.kang.design.factory.abstractFatory.api.PizzaFactory;
import com.kang.design.factory.abstractFatory.impl.ChangshaPizza;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/2.
 * @Author Healthy
 * @Version
 */
public class DiChangshaStore  {

    private  final  static PizzaFactory changshaFactory  =new ChangshaFactory();

    protected DiPizza createPizza() {
        //这里懒写了if else
       /* if("createPizza".equals("abc")){
            return new ChangshaPizza(changshaFactory);
        }else{
        }*/
        return new ChangshaPizza(changshaFactory);
    }
}
