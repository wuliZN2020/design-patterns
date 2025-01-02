package com.learn.demo3;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/2 21:31
 */
public class ComputerDemo {

    public static void main(String[] args) {

        Computer computer = new Computer();

        computer.setCpu(new IntelCpu());
        computer.setMemory(new KingstonMemory());
        computer.setDisk(new XiJieHardDisk());

        computer.run();
    }
}


