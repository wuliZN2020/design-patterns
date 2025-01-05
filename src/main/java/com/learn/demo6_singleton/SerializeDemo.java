package com.learn.demo6_singleton;

import java.io.*;

/**
 * @author ：zhangna
 * @description：序列化破坏单例模式
 * @date ：2025/1/4 17:13
 */
public class SerializeDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeObject();
        LazySingleton4 singleton = readObject();
        LazySingleton4 singleton2 = readObject();
        System.out.println(singleton == singleton2); // false

    }

    public static LazySingleton4 readObject() throws IOException, ClassNotFoundException {
        // 1 创建输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.txt"));
        // 2 读取输入流对象
        LazySingleton4 singleton = (LazySingleton4) ois.readObject();

        return singleton;
    }

    public static void writeObject() throws IOException {
        // 1 获取Singleton对象
        LazySingleton4 instance = LazySingleton4.newInstance();
        // 2 创建输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.txt"));
        oos.writeObject(instance);
    }
}



