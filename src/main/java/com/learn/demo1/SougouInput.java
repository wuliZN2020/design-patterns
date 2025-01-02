package com.learn.demo1;

import lombok.Data;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/1 13:32
 */
@Data
public class SougouInput {

    private AbstractSkin skin;

    public void display(){
        skin.show();
    }
}


