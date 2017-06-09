package com.kang.design.proxy.remoteservice.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/3.
 * @Author Healthy
 * @Version
 */
public interface MyRemote extends Remote{

    public String sayHello() throws RemoteException;
}
