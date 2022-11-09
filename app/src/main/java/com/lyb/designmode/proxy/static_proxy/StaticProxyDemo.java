package com.lyb.designmode.proxy.static_proxy;

public class StaticProxyDemo {

    public void treat(){
        UserDaoProxy userDaoProxy = new UserDaoProxy(new UserDao());
        userDaoProxy.save();
    }
}
