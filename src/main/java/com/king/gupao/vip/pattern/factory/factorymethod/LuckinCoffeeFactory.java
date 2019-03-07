package com.king.gupao.vip.pattern.factory.factorymethod;

import com.king.gupao.vip.pattern.factory.simplefactory.LuckinCoffee;
import com.king.gupao.vip.pattern.factory.simplefactory.Coffee;

/**
 * @author King Chen
 * @Date: 2019/3/7 22:45
 */
public class LuckinCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee makeCoffee() {
        return new LuckinCoffee();
    }
}
