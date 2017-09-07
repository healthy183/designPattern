package com.kang.design.template.wrapperTemplate;

import com.kang.design.template.wrapperTemplate.context.BaseContext;
import com.kang.design.template.wrapperTemplate.request.MobileRequest;
import com.kang.design.template.wrapperTemplate.request.SchoolRequest;
import com.kang.design.template.wrapperTemplate.template.LinkRemoteTemplate;
import com.kang.design.template.wrapperTemplate.template.MobileRemoteTemplate;
import com.kang.design.template.wrapperTemplate.wrappers.SchoolWrapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/20
 */
@Slf4j
public class MainRun {

    public static void main(String[] args) {

        BaseContext baseContext  = new BaseContext();
        baseContext.setInitiationID("111222");

        SchoolWrapper<MobileRequest> schoolWrapper = new SchoolWrapper<MobileRequest>(baseContext);

        MobileRequest mobileRequest  = new MobileRequest();
        mobileRequest.setNumId(966);
        mobileRequest.setNumStr("966Str");
        schoolWrapper.setRequest(mobileRequest);

        MobileRemoteTemplate mobileRemoteTemplate = new MobileRemoteTemplate();
        BaseContext resultBaseContext = mobileRemoteTemplate.call(schoolWrapper);
        log.info("result:"+resultBaseContext.getResponse());

        log.info("=======================");

        LinkRemoteTemplate linkRemoteTemplate = new LinkRemoteTemplate();
        SchoolRequest schoolRequest = new SchoolRequest();
        schoolRequest.setSchoolID(1);
        schoolRequest.setSchoolName("humSchool");
        schoolWrapper.setSchoolRequest(schoolRequest);

        linkRemoteTemplate.call(schoolWrapper);
        log.info("result:"+resultBaseContext.getResponse());
    }



}
