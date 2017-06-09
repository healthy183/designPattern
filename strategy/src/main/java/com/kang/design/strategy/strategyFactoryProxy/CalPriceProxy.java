package com.kang.design.strategy.strategyFactoryProxy;

import com.kang.design.strategy.strategyFactory.api.CalPrice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.SortedMap;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/4.
 * @Author Healthy
 * @Version
 */
public class CalPriceProxy implements InvocationHandler {

    private SortedMap<Integer,Class<? extends CalPrice>> clazzMap;

    private CalPriceProxy(SortedMap<Integer,Class<? extends CalPrice>> clazzMap){
        this.clazzMap = clazzMap;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Double result = 0D;
        if(method.getName().equals("calPrice")){
            for(Class<? extends CalPrice> clazz: clazzMap.values()){
                if(result == 0D){
                    result = (Double) method.invoke(clazz.newInstance(),args);
                }else{
                    result = (Double) method.invoke(clazz.newInstance(),result);
                }
            }
            return result;
        }
        return null;
    }

    public static CalPrice getProxy(SortedMap<Integer,Class<? extends CalPrice>> clazzMap){
        return (CalPrice) Proxy.newProxyInstance(CalPriceProxy.class.getClassLoader(),
                new Class<?>[]{CalPrice.class},
                new CalPriceProxy(clazzMap));
    }
}
