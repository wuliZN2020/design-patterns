package com.learn.demo6_singleton;

/**
 * @author ：zhangna
 * @description：懒汉式实现3:双重检查锁（多线程存在空指针问题，JVM在实例化对象时会进行指令优化和重排序）
 * @date ：2025/1/4 17:01
 */
public class LazySingleton3 {

    private LazySingleton3() {
    }

    private static LazySingleton3 instance;

    public static LazySingleton3 newInstance() {
        if (instance == null) {
            synchronized (LazySingleton3.class) {
                if (instance == null) {
                    instance = new LazySingleton3();
                }
            }
        }
        return instance;
    }
}


