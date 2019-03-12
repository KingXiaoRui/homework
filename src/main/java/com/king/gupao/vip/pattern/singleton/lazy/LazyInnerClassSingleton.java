package com.king.gupao.vip.pattern.singleton.lazy;
/**
 * 性能最优
 */

/**
 * @author King Chen
 * @Date: 2019/3/12 16:41
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        if (LazyHolder.LAZY_INNER_CLASS_SINGLETON != null) {
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY_INNER_CLASS_SINGLETON;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY_INNER_CLASS_SINGLETON = new LazyInnerClassSingleton();
    }
}
