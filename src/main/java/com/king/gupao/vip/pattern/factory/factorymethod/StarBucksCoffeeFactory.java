package com.king.gupao.vip.pattern.factory.factorymethod;

import com.king.gupao.vip.pattern.factory.simplefactory.Coffee;
import com.king.gupao.vip.pattern.factory.simplefactory.StarBucksCoffee;

/**
 * @author King Chen
 * @Date: 2019/3/7 22:45
 */
public class StarBucksCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee makeCoffee() {
        return new StarBucksCoffee();
    }
}
