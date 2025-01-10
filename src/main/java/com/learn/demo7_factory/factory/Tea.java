package com.learn.demo7_factory.factory;

import lombok.Data;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/9 21:29
 */
@Data
public abstract class Tea {

    public abstract String getName();

    public abstract void addSugar();

    public abstract void addMilk();
}

