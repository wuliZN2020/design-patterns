package com.learn.demo7_factory.factory;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/9 22:09
 */
public class GreenTea extends Tea{

    @Override
    public String getName() {
        return "绿茶";
    }

    @Override
    public void addSugar() {
        System.out.println(getName() + "加糖");
    }

    @Override
    public void addMilk() {
        System.out.println(getName() + "加奶");
    }
}


