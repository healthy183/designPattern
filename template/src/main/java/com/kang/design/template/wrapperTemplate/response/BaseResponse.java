package com.kang.design.template.wrapperTemplate.response;

import lombok.Data;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/20
 */
@Data
public class BaseResponse<T> implements java.io.Serializable {

    private String initiationID;

    private String errorCode;

    private String errorMsg;

    private T result;
}
