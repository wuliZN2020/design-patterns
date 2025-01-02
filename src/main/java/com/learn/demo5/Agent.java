package com.learn.demo5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/2 22:13
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Agent {

    private Star star;

    private Company company;

    private Fans fans;

    public void meeting(){
        System.out.println(fans.getName() + "与" + star.getName() + "见面");
    }

    public void talking(){
        System.out.println(company.getName() + "与" + star.getName() + "交流");
    }
}


