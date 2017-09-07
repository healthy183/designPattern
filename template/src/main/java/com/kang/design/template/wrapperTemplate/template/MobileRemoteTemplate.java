package com.kang.design.template.wrapperTemplate.template;

import com.kang.design.template.wrapperTemplate.request.MobileRequest;
import com.kang.design.template.wrapperTemplate.response.BaseResponse;
import com.kang.design.template.wrapperTemplate.service.MobileRemoteService;
import com.kang.design.template.wrapperTemplate.wrappers.Wrapper;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/20
 */

public class MobileRemoteTemplate extends PhoneRemoteTemplate<Wrapper<MobileRequest>> {
    @Override
    protected BaseResponse<?> callInner(Wrapper<MobileRequest> wrapper) {
        MobileRemoteService  mobileRemoteService = new MobileRemoteService();
        BaseResponse baseResponse  = mobileRemoteService.sayHi(wrapper.getRequest());
        return baseResponse;
    }
}
