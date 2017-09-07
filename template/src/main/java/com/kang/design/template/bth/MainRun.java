package com.kang.design.template.bth;

import com.kang.design.template.bth.order.PayTimelyOrderDto;
import com.kang.design.template.bth.service.BaseTimelyService;
import com.kang.design.template.bth.service.PayTimelyService;
import com.kang.design.template.bth.temple.RunTemplesImpl;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/19
 */

public class MainRun {

    public static void main(String[] args) {
        BaseTimelyService<PayTimelyOrderDto> payTimelyService = new PayTimelyService<PayTimelyOrderDto>();
        RunTemplesImpl temples = new RunTemplesImpl(payTimelyService);
        temples.exexute();
    }
}
