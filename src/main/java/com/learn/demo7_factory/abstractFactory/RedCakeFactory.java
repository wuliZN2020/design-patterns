package com.learn.demo7_factory.abstractFactory;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/8 22:02
 */
public class RedCakeFactory extends CakeFactory{
    @Override
    Tea creatTea() {
        return new RedTea();
    }

    @Override
    Cake crateCake() {
        return new RedCake();
    }
}


