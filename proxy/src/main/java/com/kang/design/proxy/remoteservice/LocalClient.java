package com.kang.design.proxy.remoteservice;

import com.google.common.base.Throwables;
import com.kang.design.proxy.remoteservice.api.MyRemote;
import lombok.extern.slf4j.Slf4j;

import java.rmi.Naming;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class LocalClient {

    public static void main(String[] args) {
        try {
            MyRemote myRemote = (MyRemote)Naming.lookup("rmi://127.0.0.1/remoteHello");
            String context = myRemote.sayHello();
            log.info(context);
        } catch (Exception e) {
            log.info(Throwables.getStackTraceAsString(e));
        }
    }
}
