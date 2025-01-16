package com.learn.demo8_prototype.pro3;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/16 22:39
 */
@Data
@Accessors(chain = true)
public class Address implements Serializable {

    private String city;
}


