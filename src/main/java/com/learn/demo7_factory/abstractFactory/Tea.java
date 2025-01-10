package com.learn.demo7_factory.abstractFactory;

import lombok.Data;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/8 21:56
 */
@Data
public abstract class Tea {

    public abstract String getName();

    public abstract void addSugar();

    public abstract void addMilk();
}

