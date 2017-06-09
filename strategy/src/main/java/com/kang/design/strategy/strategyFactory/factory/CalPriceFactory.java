package com.kang.design.strategy.strategyFactory.factory;

import com.google.common.base.Throwables;
import com.kang.design.strategy.strategyFactory.api.CalPrice;
import com.kang.design.strategy.strategyFactory.api.TotalValidRegion;
import com.kang.design.strategy.strategyFactory.component.Customer;
import com.kang.design.strategy.strategyFactory.impl.CommonCalPrice;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/4.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class CalPriceFactory {
    /**
     * 扫描包
     */
    private static final String CAL_PRICE_PACKAGE = "com.kang.design.strategy.strategyFactory.impl";

    /**
     * 加载策略时的类加载器
     */
    private ClassLoader classLoader =  this.getClass().getClassLoader();

    /**
     * 策略列表
     */
    private List<Class<? extends CalPrice>>  calPriceList;

    public  CalPrice createCalPrice(Customer customer){
        for(Class<? extends CalPrice> calPrice : calPriceList){
            TotalValidRegion totalValidRegion  = handleAnnotation(calPrice);
            if (customer.getTotalAmount() >= totalValidRegion.min() && customer.getTotalAmount() < totalValidRegion.max()) {
                try {
                    return calPrice.newInstance();
                }catch (Exception e){
                    log.info(Throwables.getStackTraceAsString(e));
                }
            }
        }
        return new CommonCalPrice();
    }

    private  static TotalValidRegion handleAnnotation(Class<? extends CalPrice> clazz){
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        if(annotations != null && annotations.length > 0){
            for(Annotation annotation : annotations){
                if(annotation instanceof TotalValidRegion ){
                    return (TotalValidRegion) annotation;
                }
            }
        }
        return null;
    }

    private CalPriceFactory(){
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

    public static CalPriceFactory getInstance(){
        return CalPriceFactoryInstance.instance;
    }

    private static class CalPriceFactoryInstance{
        private static CalPriceFactory instance = new CalPriceFactory();
    }

}
