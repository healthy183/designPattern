package com.kang.design.template.wrapperTemplate.wrappers;

import com.kang.design.template.wrapperTemplate.context.BaseContext;
import com.kang.design.template.wrapperTemplate.request.SchoolRequest;
import lombok.Data;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/20
 */
@Data
public class SchoolWrapper<T> extends Wrapper {

    public SchoolWrapper(BaseContext baseContext) {
        super(baseContext);
    }

    private SchoolRequest schoolRequest;
}
