package com.learn.demo6_singleton;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/4 16:57
 */
public class SingletonTest {

    public static void main(String[] args) {
        HungrySingleton1 hungrySingleton1 = HungrySingleton1.newInstance();
        HungrySingleton1 hungrySingleton2 = HungrySingleton1.newInstance();
        System.out.println(hungrySingleton1 == hungrySingleton2);
    }
}


