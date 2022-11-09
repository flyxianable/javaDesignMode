package com.lyb.designmode.proxy.dynamic;

import com.lyb.designmode.proxy.static_proxy.IUserDao;
import com.lyb.designmode.proxy.static_proxy.UserDao;

public class DynamicProxyDemo {

    public void treat(){
       IUserDao proxy =  (IUserDao)new ProxyFactory(new UserDao()).getProxyInstance();
       proxy.save();
    }

}
