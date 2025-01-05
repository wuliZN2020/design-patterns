package com.learn.demo6_singleton;

/**
 * @author ：zhangna
 * @description：饿汉式实现方式：静态代码块实现
 * @date ：2025/1/4 16:49
 */
public class HungrySingleton2 {

    private HungrySingleton2() {}

    private static HungrySingleton2 instance;

    static {
        instance = new HungrySingleton2();
    }

    public static HungrySingleton2 newInstance() {
        return instance;
    }
}


