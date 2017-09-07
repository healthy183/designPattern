package com.kang.design.template.bth.service;

import com.kang.design.template.bth.order.TimelyOrderDto;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/19
 */

public interface BaseTimelyService<T extends TimelyOrderDto> {

    public void getName(TimelyOrderDto timelyOrderDto);
}
