package com.learn.demo7_factory.system;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/5 21:06
 */
public class Client {

    public static void main(String[] args) {
        TeaStore teaStore = new TeaStore();
        Tea red = teaStore.orderTea("red");
        System.out.println(red.getName());
    }
}


