package com.king.gupao.vip.pattern.singleton.lazy;

/**
 * @author King Chen
 * @Date: 2019/3/12 16:30
 */
public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton lazySingleton;

    private LazyDoubleCheckSingleton() {
    }

    //双重检查
    public static LazyDoubleCheckSingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazySingleton;
    }
}
