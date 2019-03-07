package com.king.gupao.vip.pattern.factory.abstractfactory;

/**
 * @author King Chen
 * @Date: 2019/3/7 23:45
 */
public abstract class AbstractCustomerFactory {
    public abstract Cafe chooseCafe();

    public abstract Coffee drinkCoffee();
}
