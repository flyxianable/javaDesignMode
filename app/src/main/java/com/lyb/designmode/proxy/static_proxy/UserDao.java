package com.lyb.designmode.proxy.static_proxy;

public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("proxy： 保存用户数据");
    }
}
