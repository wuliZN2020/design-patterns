package com.learn.demo7_factory.simpleFactory;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/5 21:10
 */
public class TeaStore {

    public Tea orderTea(String type){
        // 1 非静态
        TeaFactory teaFactory = new TeaFactory();
        Tea tea = teaFactory.creatTea(type);
        // 2 静态
        // Tea tea2 = StaticTeaFactory.creatTea(type);
        // 3 拓展简单工厂模式
        // Tea tea3 = ExtentTeaFactory.createTea(type);
        return tea;
    }
}


