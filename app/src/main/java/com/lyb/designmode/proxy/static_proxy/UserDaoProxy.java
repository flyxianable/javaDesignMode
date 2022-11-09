package com.lyb.designmode.proxy.static_proxy;

/**
 * 静态代理
 */
public class UserDaoProxy implements IUserDao{

    public UserDaoProxy(IUserDao targert) {
        this.targert = targert;
    }

    private IUserDao targert;

    @Override
    public void save() {

        System.out.println("额外功能1");//扩展了额外功能

        if(targert != null) {
            targert.save();
        }

        System.out.println("额外功能2");//扩展了额外功能
    }
}
