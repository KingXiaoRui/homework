package com.king.gupao.vip.pattern.factory;

import com.king.gupao.vip.pattern.factory.factorymethod.LuckinCoffeeFactory;
import com.king.gupao.vip.pattern.factory.factorymethod.PacificCoffeeFactory;
import com.king.gupao.vip.pattern.factory.factorymethod.StarBucksCoffeeFactory;
import com.king.gupao.vip.pattern.factory.simplefactory.Coffee;

/**
 * @author King Chen
 * @Date: 2019/3/7 22:33
 */
public class FactoryMethodTest {
    private static Coffee coffee;

    public static void main(String[] args) {
        //PacificCoffee
        coffee = new PacificCoffeeFactory().makeCoffee();
        coffee.drink("customerA");
        //StarBucksCoffee
        coffee = new StarBucksCoffeeFactory().makeCoffee();
        coffee.drink("customerB");
        //LuckinCoffee
        coffee = new LuckinCoffeeFactory().makeCoffee();
        coffee.drink("King");
    }
}
