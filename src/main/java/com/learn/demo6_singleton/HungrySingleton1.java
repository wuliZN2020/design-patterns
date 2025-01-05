package com.learn.demo6_singleton;

/**
 * @author ：zhangna
 * @description：饿汉式实现1：静态变量实现方法
 * @date ：2025/1/4 16:45
 */
public class HungrySingleton1 {

    // 1. 私有化构造方法
    private HungrySingleton1() {}

    // 2. 随着类的加载而创建，可能会造成内存泄漏问题
    private static HungrySingleton1 instance = new HungrySingleton1();

    public static HungrySingleton1 newInstance() {
        return instance;
    }
}


