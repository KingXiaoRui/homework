package com.king.gupao.vip.pattern.factory;

import com.king.gupao.vip.pattern.factory.simplefactory.Coffee;
import com.king.gupao.vip.pattern.factory.simplefactory.CoffeeSimpleFactory;
import com.king.gupao.vip.pattern.factory.simplefactory.PacificCoffee;

/**
 * @author King Chen
 * @Date: 2019/3/7 22:07
 */
public class SimpleFactoryTest {
    private static Coffee coffee;

    public static void main(String[] args) {
        String customerA = "com.king.gupao.vip.pattern.factory.simplefactory.LuckinCoffee";
        String customerB = "com.king.gupao.vip.pattern.factory.simplefactory.PacificCoffee";
        String customerC = "com.king.gupao.vip.pattern.factory.simplefactory.StarBucksCoffee";

        CoffeeSimpleFactory coffeeSimpleFactory = new CoffeeSimpleFactory();
        //LuckinCoffee
        coffee = coffeeSimpleFactory.makeCoffee(customerA);
        coffee.drink("customerA");
        //PacificCoffee
        coffee = coffeeSimpleFactory.makeCoffee(customerB);
        coffee.drink("customerB");
        //StarBucksCoffee
        coffee = coffeeSimpleFactory.makeCoffee(customerC);
        coffee.drink("customerC");
        //PacificCoffee
        coffee = coffeeSimpleFactory.makeCoffee(PacificCoffee.class);
        coffee.drink("King");
    }
}
