package com.king.gupao.vip.pattern.factory.abstractfactory;

/**
 * @author King Chen
 * @Date: 2019/3/8 0:04
 */
public class CustomerB extends AbstractCustomerFactory {
    @Override
    public Cafe chooseCafe() {
        return new PacificCafe();
    }

    @Override
    public Coffee drinkCoffee() {
        return new MochaCoffee();
    }
}
