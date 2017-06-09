package com.kang.design.strategy.strategyFactoryProxy.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/4.
 * @Author Healthy
 * @Version
 */
//这是我们的总额有效区间注解，可以给策略添加有效区间的设置
@Target(ElementType.TYPE)//表示只能给类添加该注解
@Retention(RetentionPolicy.RUNTIME)//这个必须要将注解保留在运行时
public @interface TotalValidRegionProxy {
    //我们引用有效区间注解
    ValidRegionProxy value() default @ValidRegionProxy;
}
