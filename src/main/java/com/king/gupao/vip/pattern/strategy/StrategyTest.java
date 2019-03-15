package com.king.gupao.vip.pattern.strategy;

import com.king.gupao.vip.pattern.strategy.payment.AliPay;
import com.king.gupao.vip.pattern.strategy.payment.HuaweiPay;
import com.king.gupao.vip.pattern.strategy.payment.WechatPay;

/**
 * @author King Chen
 * @Date: 2019/3/15 16:26
 */
public class StrategyTest {
    public static void main(String[] args) {

        System.out.println("customerA want to choose Wechat to pay the money");
        Xero xero = new Xero(new WechatPay());
        System.out.println("customerA pay the money");
        xero.excutePayment();

        System.out.println("customerB want to choose Alibaba to pay the money");
        xero = new Xero(new AliPay());
        System.out.println("customerB pay the money");
        xero.excutePayment();

        System.out.println("customerC want to choose Huawei to pay the money");
        xero = new Xero(new HuaweiPay());
        System.out.println("customerC pay the money");
        xero.excutePayment();
    }
}
