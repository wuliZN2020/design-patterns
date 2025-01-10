package com.learn.demo7_factory.simpleFactory;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/5 20:57
 */
public class RedTea extends Tea {

    @Override
    public String getName() {
        return "红茶";
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


