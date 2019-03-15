package com.king.gupao.vip.pattern.strategy.payment;

/**
 * @author King Chen
 * @Date: 2019/3/15 16:20
 */
public class AliPay implements Payment {
    @Override
    public void pay() {
        System.out.println("use Ali Pay success");
    }
}
