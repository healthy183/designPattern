package com.kang.design.template.wrapperTemplate.template;

import com.kang.design.template.wrapperTemplate.context.BaseContext;
import com.kang.design.template.wrapperTemplate.wrappers.Wrapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/20
 */
@Slf4j
public abstract class RemoteTemplate<T extends Wrapper> {

    public final BaseContext call(T wrapper) {
        BaseContext baseContext = wrapper.getBaseContext();
        try{
            Object obj = callTemplate(wrapper);
        }finally {
           /* log.info("remote Current data context:[{}]\n[{}].",
                    baseContext.getInitiationID(),baseContext.toString());*/
        }
        return baseContext;
    }

    protected abstract Object callTemplate(T wrapper);

 }
