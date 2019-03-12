package com.king.gupao.vip.pattern.singleton.lazy;
/**
 * 懒汉单例模式
 * 特点：构造方法私有化、当调用getInstance方法才会初始化。
 * 缺点：相比较饿汉，节省资源
 */

/**
 * @author King Chen
 * @Date: 2019/3/12 15:39
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {
    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            return lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
