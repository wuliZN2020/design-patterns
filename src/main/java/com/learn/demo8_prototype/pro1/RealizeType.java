package com.learn.demo8_prototype.pro1;

/**
 * @author ：zhangna
 * @description：具体的原型类
 * @date ：2025/1/16 22:21
 */
public class RealizeType implements Cloneable{

    public RealizeType(){
        System.out.println("创建具体的原型对象！");
    }

    @Override
    protected RealizeType clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (RealizeType) super.clone();
    }
}


