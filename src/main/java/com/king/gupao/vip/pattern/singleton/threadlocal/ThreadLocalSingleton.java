package com.king.gupao.vip.pattern.singleton.threadlocal;
/**
 * 使用ThreadLocal实现多数据源动态切换
 * 保证线程内部的全局唯一，天生线程安全
 */

/**
 * @author King Chen
 * @Date: 2019/3/12 17:46
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
}
