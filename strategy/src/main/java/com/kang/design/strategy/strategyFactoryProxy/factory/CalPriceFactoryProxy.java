package com.kang.design.strategy.strategyFactoryProxy.factory;

import com.google.common.base.Throwables;
import com.kang.design.strategy.strategyFactory.api.CalPrice;
import com.kang.design.strategy.strategyFactoryProxy.CalPriceProxy;
import com.kang.design.strategy.strategyFactoryProxy.api.OnceValidRegionProxy;
import com.kang.design.strategy.strategyFactoryProxy.api.TotalValidRegionProxy;
import com.kang.design.strategy.strategyFactoryProxy.component.CustomerProxy;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/4.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class CalPriceFactoryProxy {
    /**
     * 扫描包
     */
    private static final String CAL_PRICE_PACKAGE = "com.kang.design.strategy.strategyFactoryProxy.impl";
    /**
     * 加载策略时的类加载器
     */
    private ClassLoader classLoader =  this.getClass().getClassLoader();

    /**
     * 策略列表
     */
    private List<Class<? extends CalPrice>>  calPriceList;

    public  CalPrice createCalPrice(CustomerProxy customer){
        //变化点:为了支持优先级排序，我们采用可排序的MAP支持,这个Map是为了储存我们当前策略的运行时类信息
        SortedMap<Integer, Class<? extends CalPrice>> clazzMap = new TreeMap<Integer, Class<? extends CalPrice>>();
        for(Class<? extends CalPrice> clazz : calPriceList){
            Annotation validRegion  = handleAnnotation(clazz);
            if(validRegion instanceof  TotalValidRegionProxy){
                TotalValidRegionProxy totalValidRegionProxy =(TotalValidRegionProxy)validRegion;
                if (customer.getTotalAmount() >= totalValidRegionProxy.value().min() && customer.getTotalAmount() < totalValidRegionProxy.value().max()) {
                    try {
                        clazzMap.put(totalValidRegionProxy.value().order(), clazz);
                    }catch (Exception e){
                        log.info(Throwables.getStackTraceAsString(e));
                    }
                }
            }else if(validRegion instanceof  OnceValidRegionProxy){
                OnceValidRegionProxy onceValidRegionProxy = (OnceValidRegionProxy) validRegion;
                if (customer.getAmount() >= onceValidRegionProxy.value().min() && customer.getAmount() < onceValidRegionProxy.value().max()) {
                    clazzMap.put(onceValidRegionProxy.value().order(), clazz);//将采用的策略放入MAP
                }
            }
        }
        try {
            //我们采用动态代理处理策略重叠的问题
            return CalPriceProxy.getProxy(clazzMap);
        } catch (Exception e) {
            throw new RuntimeException("策略获得失败");
        }
    }

    private  static Annotation  handleAnnotation(Class<? extends CalPrice> clazz){
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        if(annotations != null && annotations.length > 0){
            for(Annotation annotation : annotations){
                if(annotation instanceof TotalValidRegionProxy || annotation instanceof OnceValidRegionProxy){
                    return annotation;
                }
            }
        }
        return null;
    }

    private CalPriceFactoryProxy(){
        init();
    }

    private void init() {
        calPriceList = new ArrayList<Class<? extends CalPrice>>();
        File[] resources = getResource();
        Class<CalPrice> calPriceClazz = null;
        try {
            calPriceClazz = (Class<CalPrice>) classLoader.loadClass(CalPrice.class.getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("未找到策略接口");
        }
        for(File file : resources){
            try {
                Class<?> clazz = classLoader.loadClass(CAL_PRICE_PACKAGE + "."+file.getName().replace(".class", ""));
                //判断是否是CalPrice的实现类并且不是CalPrice它本身，满足的话加入到策略列表
                if(CalPrice.class.isAssignableFrom(clazz) && clazz != calPriceClazz){
                    calPriceList.add((Class<? extends CalPrice>) clazz);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private File[] getResource(){
        try{
            File file = new File(classLoader.getResource(CAL_PRICE_PACKAGE.replace(".","/")).toURI());
            return file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.getName().endsWith(".class");
                }
            });
        }catch(Exception e){
            throw new RuntimeException("未找到策略资源");
        }
    }

    public static CalPriceFactoryProxy getInstance(){
        return CalPriceFactoryInstance.instance;
    }

    private static class CalPriceFactoryInstance{
        private static CalPriceFactoryProxy instance = new CalPriceFactoryProxy();
    }

}
