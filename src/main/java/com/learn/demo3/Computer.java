package com.learn.demo3;

import lombok.Data;

import javax.annotation.processing.Processor;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/2 21:30
 */
@Data
public class Computer {

    private Cpu cpu;

    private Memory memory;

    private Disk disk;

    public void run(){
        disk.save("数据");
        disk.get();
        memory.save();
        cpu.run();
    }
}


