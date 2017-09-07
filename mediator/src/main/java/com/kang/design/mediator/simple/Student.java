package com.kang.design.mediator.simple;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/17.
 * @Author Healthy
 * @Version
 */
@Data
@AllArgsConstructor
public class Student implements java.io.Serializable {

    private String name;

    private PatternAlliance patternAlliance;

    public void changeName(String name){
        patternAlliance.dochangeName(this,name);
    };

}
