package com.learn.demo8_prototype.pro2;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/16 22:30
 */
@Data
@Accessors(chain = true)
public class People implements Cloneable {

    private String name;

    private int age;

    @Override
    protected People clone() throws CloneNotSupportedException {
        return (People) super.clone();
    }

    public void getInfo(){
        System.out.println("name = " + name + "\t" + "age = " + age);
    }
}


