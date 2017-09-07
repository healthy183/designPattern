package com.kang.design.template.bth.temple;

import com.kang.design.template.bth.order.PayTimelyOrderDto;
import com.kang.design.template.bth.runnables.PayRunnable;
import com.kang.design.template.bth.service.BaseTimelyService;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/19
 */

public class RunTemplesImpl extends AbstractTemples<PayTimelyOrderDto,PayRunnable> {

    private BaseTimelyService<PayTimelyOrderDto> timelyService;

    public RunTemplesImpl(BaseTimelyService<PayTimelyOrderDto> baseTimelyService){
        this.timelyService = baseTimelyService;
        super.baseTimelyService = timelyService;
    }

    @Override
    public void sayHi(PayTimelyOrderDto timelyOrderDto) {
        timelyOrderDto.sayHi();
    }
}
