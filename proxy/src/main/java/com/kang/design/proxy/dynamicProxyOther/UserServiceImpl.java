package com.kang.design.proxy.dynamicProxyOther;

import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        log.info("add");
    }
}
