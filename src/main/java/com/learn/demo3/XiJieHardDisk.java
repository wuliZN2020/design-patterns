package com.learn.demo3;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/2 21:22
 */
public class XiJieHardDisk implements Disk{


    @Override
    public String get() {
        System.out.println("使用希捷硬盘获取数据");
        return "数据";
    }

    @Override
    public void save(String data) {
        System.out.println("使用希捷硬盘获取数据：" + data);
    }
}


