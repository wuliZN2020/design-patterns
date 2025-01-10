package com.learn.demo7_factory.simpleFactory;

import lombok.Data;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/5 20:50
 */

@Data
public abstract class Tea {

    public abstract String getName();

    public abstract void addSugar();

    public abstract void addMilk();
}


