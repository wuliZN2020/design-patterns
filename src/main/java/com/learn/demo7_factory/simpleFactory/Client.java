package com.learn.demo7_factory.simpleFactory;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/8 21:47
 */
public class Client {
    public static void main(String[] args) {
        TeaStore teaStore = new TeaStore();
        Tea red = teaStore.orderTea("red");
        red.addMilk();
        red.addSugar();
    }
}


