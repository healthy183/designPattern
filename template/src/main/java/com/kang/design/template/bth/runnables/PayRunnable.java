package com.kang.design.template.bth.runnables;

import com.kang.design.template.bth.order.TimelyOrderDto;
import com.kang.design.template.bth.service.BaseTimelyService;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/19
 */

public class PayRunnable  implements Runnable {

    private BaseTimelyService baseTimelyService;
    private TimelyOrderDto timelyOrderDto;

    public  PayRunnable(BaseTimelyService baseTimelyService, TimelyOrderDto timelyOrderDto){
        this.baseTimelyService = baseTimelyService;
        this.timelyOrderDto = timelyOrderDto;
    }

    @Override
    public void run() {
        baseTimelyService.getName(timelyOrderDto);
    }
}
