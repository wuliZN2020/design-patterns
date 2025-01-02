package com.learn.demo2;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/1 13:55
 */
public class Client {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(1);
        rectangle.setWidth(1);

        resize(rectangle);
        printLengthAndWidth(rectangle);
    }

    public static void resize(Rectangle rectangle){
        while(rectangle.getLength() <= rectangle.getWidth()){
            rectangle.setLength(rectangle.getLength() + 1);
        }
    }

    public static void printLengthAndWidth(SiBianXing siBianXing){
        System.out.println(siBianXing.getLength());
        System.out.println(siBianXing.getWidth());
    }
}


