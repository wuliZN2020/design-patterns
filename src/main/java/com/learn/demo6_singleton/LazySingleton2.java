package com.learn.demo6_singleton;

/**
 * @author ：zhangna
 * @description：懒汉式实现2：线程安全（方法加锁，执行效率低）
 * @date ：2025/1/4 16:58
 */
public class LazySingleton2 {

    private LazySingleton2() {
    }

    private static LazySingleton2 instance;

    public static synchronized LazySingleton2 newInstance() {
        if (instance == null) {
            instance = new LazySingleton2();
        }
        return instance;
    }
}


