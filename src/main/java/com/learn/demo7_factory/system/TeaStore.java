package com.learn.demo7_factory.system;

import org.apache.commons.lang.StringUtils;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/5 21:01
 */
public class TeaStore {
    // Tea和TeaStore耦合
    public Tea orderTea(String type){
        if(StringUtils.equals(type, "red")){
            return new RedTea();
        }else if(StringUtils.equals(type, "green")){
            return new GreenTea();
        }else{
            throw new RuntimeException("type error");
        }
    }
}


