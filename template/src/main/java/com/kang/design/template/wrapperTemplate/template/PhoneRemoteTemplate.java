package com.kang.design.template.wrapperTemplate.template;

import com.google.common.base.Throwables;
import com.kang.design.template.wrapperTemplate.context.BaseContext;
import com.kang.design.template.wrapperTemplate.response.BaseResponse;
import com.kang.design.template.wrapperTemplate.wrappers.Wrapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/20
 */
@Slf4j
public abstract class PhoneRemoteTemplate<T extends Wrapper> extends RemoteTemplate<T> {

    private static final String BEFORE_LOG_MSG = "Calling remote service[{}][{}].\nsent request:{}.";
    private static final String AFTER_LOG_MSG = "Called remote service[{}][{}].\n[{}]";

    @Override
    public Object callTemplate(T wrapper) {
        String className = this.getClass().getSimpleName();//获得类名
        BaseContext baseContext = wrapper.getBaseContext();
        BaseResponse<?> response = null;
        try{
            log.info(BEFORE_LOG_MSG,
                    className, baseContext.getInitiationID(), wrapper.toString());
            response = callInner(wrapper);
            log.info(AFTER_LOG_MSG,
                    className, baseContext.getInitiationID(), response.toString());
        }catch(Exception e){
            log.error("Failed call remote service[{}][{}]\ncause:{}",className,
                    baseContext.getInitiationID(),
                    Throwables.getStackTraceAsString(e));
            baseContext.setErrorCode("666666");
            baseContext.setErrorMsg("unknowException");
            return response;
        }
        baseContext.setErrorCode(response.getErrorCode());
        baseContext.setErrorMsg(response.getErrorMsg());
        baseContext.setResponse(response);

        return response;
    }


    protected abstract BaseResponse<?> callInner(T wrapper);
}
