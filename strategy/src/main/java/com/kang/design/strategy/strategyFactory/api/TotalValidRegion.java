package com.kang.design.strategy.strategyFactory.api;

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
@Target(ElementType.TYPE)//只能给类使用
@Retention(RetentionPolicy.RUNTIME)//运行期有效
public @interface TotalValidRegion {

    int  max() default Integer.MAX_VALUE;
    int  min() default Integer.MIN_VALUE;
}
