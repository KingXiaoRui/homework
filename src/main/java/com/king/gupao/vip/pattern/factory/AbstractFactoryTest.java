package com.king.gupao.vip.pattern.factory;

import com.king.gupao.vip.pattern.factory.abstractfactory.AbstractCustomerFactory;
import com.king.gupao.vip.pattern.factory.abstractfactory.CustomerA;
import com.king.gupao.vip.pattern.factory.abstractfactory.CustomerB;

/**
 * @author King Chen
 * @Date: 2019/3/7 23:53
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractCustomerFactory customerA = new CustomerA();
        customerA.chooseCafe().chooseCafe();
        customerA.drinkCoffee().drinkCoffee();

        AbstractCustomerFactory customerB = new CustomerB();
        customerB.chooseCafe().chooseCafe();
        customerB.drinkCoffee().drinkCoffee();
    }
}
