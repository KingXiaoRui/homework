package com.king.gupao.vip.pattern.singleton.seriable;

/**
 * @author King Chen
 * @Date: 2019/3/12 16:59
 */
public class SerizableSingleton {
    private static SerizableSingleton SERIZABLE_SINGLETON = new SerizableSingleton();

    private SerizableSingleton() {
    }

    public static SerizableSingleton getInstance() {
        return SERIZABLE_SINGLETON;
    }

    private Object readResoleve() {
        return SERIZABLE_SINGLETON;
    }
}
