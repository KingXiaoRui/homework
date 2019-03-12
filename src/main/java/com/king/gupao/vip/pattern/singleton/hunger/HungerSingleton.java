package com.king.gupao.vip.pattern.singleton.hunger;
/**
 * 饿汉单例模式
 * 特点：构造方法私有化、类加载时立即初始化。
 * 缺点：耗费资源
 */

/**
 * @author King Chen
 * @Date: 2019/3/12 15:33
 */
public class HungerSingleton {
    private static final HungerSingleton hungerSingleton = new HungerSingleton();

    private HungerSingleton() {
    }

    public static HungerSingleton getInstance() {
        return hungerSingleton;
    }
}
