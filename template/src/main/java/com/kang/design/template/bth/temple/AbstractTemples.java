package com.kang.design.template.bth.temple;

import com.google.common.base.Throwables;
import com.kang.design.template.bth.order.TimelyOrderDto;
import com.kang.design.template.bth.service.BaseTimelyService;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/19
 */
@Slf4j
public abstract class AbstractTemples<T extends TimelyOrderDto,M extends Runnable>{

    protected BaseTimelyService<T> baseTimelyService;

    public abstract  void sayHi(T timelyOrderDto);

    public final void  exexute(){
        M runnable = null;
        try {
            T timelyOrderDto = getFirstInstance();
            Class<M> entityClass = (Class<M>) ((ParameterizedType) getClass()
                    .getGenericSuperclass()).getActualTypeArguments()[1];
            Constructor con = entityClass.getConstructor(
                    baseTimelyService.getClass().getSuperclass().getInterfaces()[0],
                    timelyOrderDto.getClass().getSuperclass());
            runnable = (M) con.newInstance(baseTimelyService, timelyOrderDto);
            Thread thread = new Thread(runnable);
            sayHi(timelyOrderDto);
            thread.start();
        }catch (ReflectiveOperationException e) {
            log.info(Throwables.getStackTraceAsString(e));
        }
    }

    private  <T> T getFirstInstance(){
        try{
            Class<T> entityClass = (Class<T>) ((ParameterizedType) getClass()
                    .getGenericSuperclass()).getActualTypeArguments()[0];
            return entityClass.newInstance();
        }catch(ReflectiveOperationException e){
            log.info(Throwables.getStackTraceAsString(e));
        }catch (ClassCastException e){
            log.info(Throwables.getStackTraceAsString(e));
        }
        return null;
    }

}
