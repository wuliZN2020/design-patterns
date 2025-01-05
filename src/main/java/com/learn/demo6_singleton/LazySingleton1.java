package com.learn.demo6_singleton;

/**
 * @author ：zhangna
 * @description：懒汉式实现1:线程不安全
 * @date ：2025/1/4 16:52
 */
public class LazySingleton1 {

    private LazySingleton1(){}

    private static LazySingleton1 instance;

    public static LazySingleton1 newInstance(){
        if(instance == null){
            // 执行顺序
            // 线程1执行到这里，线程2获得执行权
            // 线程2执行到这，线程1又获得执行权
            // 线程1实例化instance = new LazySingleton1();
            // 线程2实例化instance = new LazySingleton1();
            // 则对象被实例化两次
            instance = new LazySingleton1();
        }
        return instance;
    }
}


