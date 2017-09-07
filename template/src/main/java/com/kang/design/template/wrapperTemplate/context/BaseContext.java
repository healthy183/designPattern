package com.kang.design.template.wrapperTemplate.context;

import com.kang.design.template.wrapperTemplate.response.BaseResponse;
import lombok.Data;
import lombok.ToString;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/20
 */
@ToString
@Data
public class BaseContext {

    private String initiationID;

    private String errorCode;

    private String errorMsg;

    private BaseResponse<?> response;


}
