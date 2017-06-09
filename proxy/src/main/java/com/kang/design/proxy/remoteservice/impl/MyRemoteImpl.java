package com.kang.design.proxy.remoteservice.impl;

import com.google.common.base.Throwables;
import com.kang.design.proxy.remoteservice.api.MyRemote;
import lombok.extern.slf4j.Slf4j;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
@Slf4j
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "hello,healthy!";
    }

    public static void main(String[] args) {
        try {
            MyRemoteImpl myRemote = new MyRemoteImpl();
            Naming.rebind("remoteHello",myRemote);
        } catch (RemoteException e) {
            log.info(Throwables.getStackTraceAsString(e));
        } catch (MalformedURLException e) {
            log.info(Throwables.getStackTraceAsString(e));
        }
    }
}
