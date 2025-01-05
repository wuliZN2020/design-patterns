package com.learn.demo6_singleton;

/**
 * @author ：zhangna
 * @description：懒汉式实现方式4:静态内部类(不用加锁且不存在线程安全问题)
 * @date ：2025/1/4 17:07
 */
public class LazySingleton5 {

    private LazySingleton5() {}

    public static class SingletonHolder{
        private static final LazySingleton5 INSTANCE = new LazySingleton5();
    }

    public static LazySingleton5 newInstance(){
        return SingletonHolder.INSTANCE;
    }
}


