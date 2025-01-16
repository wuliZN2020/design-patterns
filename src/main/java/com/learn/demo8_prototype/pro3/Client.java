package com.learn.demo8_prototype.pro3;

import com.learn.demo8_prototype.pro3.People;

import java.io.FilterOutputStream;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/16 22:41
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        People people = new People();
        Address address = new Address().setCity("BEIJING");
        people.setAddress(address);

        People people2 = people.clone();
        // People(address=Address(city=BEIJING))
        System.out.println(people);
        // People(address=Address(city=BEIJING))
        System.out.println(people2);

        people2.getAddress().setCity("SHANGHAI");
        // People(address=Address(city=SHANGHAI))
        System.out.println(people);
        // People(address=Address(city=SHANGHAI))
        System.out.println(people2);

        // false
        System.out.println(people == people2);
        // true
        System.out.println(people.getAddress() == people2.getAddress());
    }
}


