package com.learn.demo8_prototype.pro3;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;


/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/16 22:38
 */
@Data
@Accessors(chain = true)
public class People implements Cloneable, Serializable {

    private Address address;

    @Override
    protected People clone() throws CloneNotSupportedException {
        return (People) super.clone();
    }
}


