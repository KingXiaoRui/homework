package com.king.gupao.vip.pattern.factory.abstractfactory;

/**
 * @author King Chen
 * @Date: 2019/3/7 23:47
 */
public class MochaCoffee implements Coffee {
    @Override
    public void drinkCoffee() {
        System.out.println("a cup of Mocha Coffee");
    }
}
