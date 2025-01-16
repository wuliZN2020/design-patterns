package com.learn.demo8_prototype.pro1;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/16 22:25
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realizeType = new RealizeType();
        RealizeType realizeType1 = realizeType.clone();

        // false
        System.out.println(realizeType1 == realizeType);
    }
}


