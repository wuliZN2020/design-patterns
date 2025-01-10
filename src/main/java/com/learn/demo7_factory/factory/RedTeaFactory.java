package com.learn.demo7_factory.factory;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/9 21:30
 */
public class RedTeaFactory extends TeaFactory {

    @Override
    public Tea getTea() {
        return new RedTea();
    }
}


