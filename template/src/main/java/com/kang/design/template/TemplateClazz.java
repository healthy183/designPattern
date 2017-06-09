package com.kang.design.template;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
public abstract class TemplateClazz {

    private static final Participations participations = new Participations();

    public final void templeMethod(){
        say();
        participations.listen();
        reject();
    }
    public abstract  void say();

    public abstract  void reject();
}
