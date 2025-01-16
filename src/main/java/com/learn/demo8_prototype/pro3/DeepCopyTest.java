package com.learn.demo8_prototype.pro3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/16 22:46
 */
public class DeepCopyTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        People people = new People();
        Address address = new Address().setCity("BEIJING");
        people.setAddress(address);

        // 创建输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("people.txt")));
        // 将people对象写入文件中
        oos.writeObject(people);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("people.txt")));
        People people1 = (People) ois.readObject();
        ois.close();

        // People(address=Address(city=BEIJING))
        System.out.println(people);
        // People(address=Address(city=BEIJING))
        System.out.println(people1);
        // false
        System.out.println(people1.getAddress() == people.getAddress());

        people1.getAddress().setCity("SHANGHAI");
        // People(address=Address(city=BEIJING))
        System.out.println(people);
        // People(address=Address(city=SHANGHAI))
        System.out.println(people1);
        // true
        System.out.println(people1.getAddress() == people.getAddress());
    }
}


