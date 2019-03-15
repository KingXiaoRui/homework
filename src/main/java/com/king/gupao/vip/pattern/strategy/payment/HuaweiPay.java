package com.king.gupao.vip.pattern.strategy.payment;

/**
 * @author King Chen
 * @Date: 2019/3/15 16:21
 */
public class HuaweiPay implements Payment {
    @Override
    public void pay() {
        System.out.println("use Huawei Pay success");
    }
}
