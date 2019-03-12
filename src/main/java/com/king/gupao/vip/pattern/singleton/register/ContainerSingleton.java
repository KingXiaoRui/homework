package com.king.gupao.vip.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 * 对象易于管理
 * 线程安全问题
 */

/**
 * @author King Chen
 * @Date: 2019/3/12 17:34
 */
public class ContainerSingleton {
    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    private ContainerSingleton() {
    }

    public static Object getBean(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return ioc;
            }
            return ioc.get(className);
        }
    }
}
