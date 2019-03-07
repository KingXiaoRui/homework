package com.king.gupao.vip.pattern.factory.abstractfactory;

/**
 * @author King Chen
 * @Date: 2019/3/7 23:46
 */
public class LatteCoffee implements Coffee{
    @Override
    public void drinkCoffee() {
        System.out.println("a cup of Latte Coffee");
    }
}
