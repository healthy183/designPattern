package com.kang.design.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class TomImpl  extends  TemplateClazz{
    @Override
    public void say() {
        log.info("tom say hi!");
    }

    @Override
    public void reject() {
        log.info("tom had been rejected!");
    }
}
