package com.learn.demo6_singleton;

import java.io.Serializable;

/**
 * @author ：zhangna
 * @description：懒汉式实现4:双重检查锁，volatile(保证可见性和有序性)
 * @date ：2025/1/4 17:05
 */
public class LazySingleton4 implements Serializable {

    private LazySingleton4() {
        if(instance != null){
            throw  new RuntimeException();
        }
    }

    private static volatile LazySingleton4 instance;

    public static synchronized LazySingleton4 newInstance() {
        if (instance == null) {
            synchronized (LazySingleton4.class) {
                if (instance == null) {
                    instance = new LazySingleton4();
                }
            }
        }
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}


