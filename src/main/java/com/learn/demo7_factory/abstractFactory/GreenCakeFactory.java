package com.learn.demo7_factory.abstractFactory;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/8 22:04
 */
public class GreenCakeFactory extends CakeFactory{
    @Override
    Tea creatTea() {
        return new GreenTea();
    }

    @Override
    Cake crateCake() {
        return new GreenCake();
    }
}


