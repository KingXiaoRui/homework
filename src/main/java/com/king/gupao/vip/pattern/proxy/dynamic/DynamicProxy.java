package com.king.gupao.vip.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author King Chen
 * @Date: 2019/3/12 21:13
 */
public class DynamicProxy implements InvocationHandler {

    private Object target;

    public Object getTarget(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass().getName() + " start to invoke " + method.getName());

        Object result = method.invoke(proxy, args);
        System.out.println(proxy.getClass().getName() + " end to invoke " + method.getName() + "\nresult is " + result);
        return result;
    }
}
