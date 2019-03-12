package com.king.gupao.vip.pattern.singleton.register;

/**
 * @author King Chen
 * @Date: 2019/3/12 17:15
 */
public enum EnumSingleton {
    /**
     * 实例instance
     */
    INSTANCE;

    private Object data;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }
}
