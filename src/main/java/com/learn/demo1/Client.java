package com.learn.demo1;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/1 13:34
 */
public class Client {

    public static void main(String[] args) {
        SougouInput sougouInput = new SougouInput();

        DefaultSkin skin = new DefaultSkin();

        sougouInput.setSkin(skin);

        sougouInput.display();
    }
}


