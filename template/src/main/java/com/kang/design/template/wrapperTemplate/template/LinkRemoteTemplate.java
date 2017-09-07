package com.kang.design.template.wrapperTemplate.template;

import com.kang.design.template.wrapperTemplate.request.MobileRequest;
import com.kang.design.template.wrapperTemplate.response.BaseResponse;
import com.kang.design.template.wrapperTemplate.service.MobileRemoteService;
import com.kang.design.template.wrapperTemplate.wrappers.SchoolWrapper;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/20
 */

public class LinkRemoteTemplate extends PhoneRemoteTemplate<SchoolWrapper<MobileRequest>> {
    @Override
    protected BaseResponse<?> callInner(SchoolWrapper<MobileRequest> wrapper) {
        MobileRemoteService  mobileRemoteService = new MobileRemoteService();
        BaseResponse baseResponse  = mobileRemoteService.sayHi((MobileRequest) wrapper.getRequest());
        return baseResponse;
    }
}
