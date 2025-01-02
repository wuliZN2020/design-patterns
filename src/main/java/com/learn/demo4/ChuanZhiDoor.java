package com.learn.demo4;


/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/2 21:47
 */
public class ChuanZhiDoor implements FireProof, AntiTheft {


    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }
}


