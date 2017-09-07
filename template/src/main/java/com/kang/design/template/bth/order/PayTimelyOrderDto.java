package com.kang.design.template.bth.order;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/19
 */
@Slf4j
public class PayTimelyOrderDto extends TimelyOrderDto {
    @Override
    public String getName() {
        return "pay";
    }

    public void sayHi(){
        log.info("say hi!");
    };
}
