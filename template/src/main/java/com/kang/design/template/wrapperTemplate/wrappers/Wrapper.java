package com.kang.design.template.wrapperTemplate.wrappers;

import com.kang.design.template.wrapperTemplate.context.BaseContext;
import com.kang.design.template.wrapperTemplate.request.BaseRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/20
 */

public class Wrapper<T> {
    @Getter
    @Setter
    private BaseContext baseContext;

    @Setter
    private T request;

    public Wrapper(BaseContext baseContext){
        this.baseContext = baseContext;
    }

    public T getRequest(){
        if(request instanceof BaseRequest){
            BaseRequest baseRequest = (BaseRequest) this.request;
            baseRequest.setInitiationID(baseContext.getInitiationID());
        }
        return this.request;
    }

}
