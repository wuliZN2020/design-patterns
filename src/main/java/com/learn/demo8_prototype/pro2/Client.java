package com.learn.demo8_prototype.pro2;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/16 22:30
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        People people = new People();
        people.setName("Tom").setAge(15);

        People people2 = people.clone();
        // People(name=Tom, age=15)
        System.out.println(people);
        // People(name=Tom, age=15)
        System.out.println(people2);
        // false
        System.out.println(people == people2);

        people2.setName("Lisa").setAge(12);
        // People(name=Tom, age=15)
        System.out.println(people);
        // People(name=Lisa, age=12)
        System.out.println(people2);
        // false
        System.out.println(people == people2);
    }
}


