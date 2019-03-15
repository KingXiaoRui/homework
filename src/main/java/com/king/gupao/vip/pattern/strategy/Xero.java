package com.king.gupao.vip.pattern.strategy;

import com.king.gupao.vip.pattern.strategy.payment.Payment;

/**
 * @author King Chen
 * @Date: 2019/3/15 16:24
 */
public class Xero {
    private Payment payment;

    public Xero(Payment payment) {
        this.payment = payment;
    }

    public void excutePayment() {
        payment.pay();
    }
}
