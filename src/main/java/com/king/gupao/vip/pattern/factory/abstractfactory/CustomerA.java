package com.king.gupao.vip.pattern.factory.abstractfactory;

/**
 * @author King Chen
 * @Date: 2019/3/8 0:02
 */
public class CustomerA extends AbstractCustomerFactory {
    @Override
    public Cafe chooseCafe() {
        return new StarBucksCafe();
    }

    @Override
    public Coffee drinkCoffee() {
        return new LatteCoffee();
    }
}
