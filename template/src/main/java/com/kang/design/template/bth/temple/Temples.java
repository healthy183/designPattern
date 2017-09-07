package com.kang.design.template.bth.temple;

import com.kang.design.template.bth.order.TimelyOrderDto;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/19
 */

public interface Temples<T extends TimelyOrderDto,M extends Runnable> {

    public  void  exexute();

}
