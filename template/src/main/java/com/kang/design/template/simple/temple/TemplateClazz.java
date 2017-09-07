package com.kang.design.template.simple.temple;

import com.kang.design.template.simple.part.Participations;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
public abstract class TemplateClazz<T extends  Participations> {

    public final void templeMethod(){
        say();
        getparticipations().listen();
        reject();
    }

    public abstract T getparticipations();

    public abstract  void say();

    public abstract  void reject();
}
