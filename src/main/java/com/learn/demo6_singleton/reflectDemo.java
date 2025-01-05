package com.learn.demo6_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/4 17:22
 */
public class reflectDemo {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class clazz = LazySingleton4.class;

        Constructor constructor = clazz.getDeclaredConstructor();

        constructor.setAccessible(true);

        LazySingleton4 singleton1 = (LazySingleton4) constructor.newInstance();
        LazySingleton4 singleton2 = (LazySingleton4) constructor.newInstance();

        System.out.println(singleton1 == singleton2);
    }
}


