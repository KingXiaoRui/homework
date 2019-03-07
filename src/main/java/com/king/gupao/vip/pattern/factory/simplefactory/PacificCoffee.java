package com.king.gupao.vip.pattern.factory.simplefactory;

/**
 * @author King Chen
 * @Date: 2019/3/7 21:56
 */
public class PacificCoffee implements Coffee {
    @Override
    public void drink(String customerName) {
        System.out.println(customerName + " wanna a cup of PacificCoffee");
    }
}
