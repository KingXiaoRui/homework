package com.king.gupao.vip.pattern.singleton.hunger;
/**
 * 饿汉单例模式
 * 特点：构造方法私有化、类加载时立即初始化。
 * 缺点：耗费资源
 */
/**
 * @author King Chen
 * @Date: 2019/3/12 16:03
 */
public class HungerStaticSingleton {
    private static final HungerStaticSingleton hungerSinglton;

    static {
        hungerSinglton = new HungerStaticSingleton();
    }

    private HungerStaticSingleton() {
    }

    public static HungerStaticSingleton getInstance() {
        return hungerSinglton;
    }
}
