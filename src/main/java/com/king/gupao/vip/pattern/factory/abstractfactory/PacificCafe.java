package com.king.gupao.vip.pattern.factory.abstractfactory;

/**
 * @author King Chen
 * @Date: 2019/3/7 23:46
 */
public class PacificCafe implements Cafe {
    @Override
    public void chooseCafe() {
        System.out.println("choose Pacific Cafe");
    }
}
