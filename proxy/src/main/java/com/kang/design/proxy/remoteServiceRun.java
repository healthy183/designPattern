package com.kang.design.proxy;

import com.kang.design.proxy.dynamicProxy.api.TestInterface;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class remoteServiceRun {

    public static void main(String[] args) {
        log.info(TestInterface.class.getSimpleName());
    }
}
