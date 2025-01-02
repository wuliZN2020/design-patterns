package com.learn.demo4;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/2 21:49
 */
public class HeiMaDoor implements AntiTheft, FireProof, WaterProof {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}


