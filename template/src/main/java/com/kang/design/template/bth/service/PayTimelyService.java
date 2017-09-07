package com.kang.design.template.bth.service;

import com.kang.design.template.bth.order.TimelyOrderDto;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/19
 */
@Slf4j
public class PayTimelyService<T extends TimelyOrderDto> extends  AbstractTimelyService<T>{

    @Override
    public void getName(TimelyOrderDto timelyOrderDto) {
        log.info(timelyOrderDto.getName());
    }
}
