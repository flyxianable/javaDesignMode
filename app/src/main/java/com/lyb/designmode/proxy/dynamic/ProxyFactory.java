package com.lyb.designmode.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * 使用java.lang.reflect.Proxy
 *
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces()
                , new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("proxy：额外功能1");//扩展了额外功能

                        //使用反射方式调用
                        Object value = method.invoke(target, args);

                        System.out.println("proxy：额外功能2");//扩展了额外功能

                        return value;
                    }
                });
    }
}
