package com.king.gupao.vip.pattern.factory.factorymethod;

import com.king.gupao.vip.pattern.factory.simplefactory.Coffee;
import com.king.gupao.vip.pattern.factory.simplefactory.PacificCoffee;

/**
 * @author King Chen
 * @Date: 2019/3/7 22:30
 */
public class PacificCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee makeCoffee() {
        return new PacificCoffee();
    }
}
