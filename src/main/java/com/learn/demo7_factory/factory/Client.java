package com.learn.demo7_factory.factory;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/9 22:13
 */
public class Client {
    public static void main(String[] args) {
        TeaStore teaStore = new TeaStore();
        teaStore.setTeaFactory(new GreenTeaFactory());
        teaStore.orderTea();
    }
}


