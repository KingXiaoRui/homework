package com.king.gupao.vip.pattern.factory.simplefactory;


/**
 * @author King Chen
 * @Date: 2019/3/7 21:43
 */
public class CoffeeSimpleFactory {

    private final static String LUCKIN_COFFEE = "com.king.gupao.vip.pattern.factory.simplefactory.LuckinCoffee";
    private final static String PACIFIC_COFFEE = "com.king.gupao.vip.pattern.factory.simplefactory.PacificCoffee";
    private final static String STARBUCKS_COFFEE = "com.king.gupao.vip.pattern.factory.simplefactory.StarBucksCoffee";

    public Coffee makeCoffee(Class coffee) {
        String coffeeName = coffee.getName();
        return makeCoffee(coffeeName);
    }

    public Coffee makeCoffee(String coffeeName) {
        if (PACIFIC_COFFEE.equals(coffeeName)) {
            return new PacificCoffee();
        } else if (STARBUCKS_COFFEE.equals(coffeeName)) {
            return new StarBucksCoffee();
        } else if (LUCKIN_COFFEE.equals(coffeeName)) {
            return new LuckinCoffee();
        }
        return null;
    }
}
