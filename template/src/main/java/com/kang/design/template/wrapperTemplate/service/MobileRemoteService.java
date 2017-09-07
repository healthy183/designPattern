package com.kang.design.template.wrapperTemplate.service;

import com.kang.design.template.wrapperTemplate.request.MobileRequest;
import com.kang.design.template.wrapperTemplate.response.BaseResponse;
import com.kang.design.template.wrapperTemplate.response.MobileRemoteResponse;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/20
 */

public class MobileRemoteService {

    public BaseResponse sayHi(MobileRequest mobileRequest){
        BaseResponse mobileRemoteResponse = new MobileRemoteResponse();
        mobileRemoteResponse.setInitiationID(mobileRequest.getInitiationID());
        mobileRemoteResponse.setErrorCode("00000");
        mobileRemoteResponse.setErrorMsg("success");
        mobileRemoteResponse.setResult(Boolean.TRUE);
        return mobileRemoteResponse;
    };
}
