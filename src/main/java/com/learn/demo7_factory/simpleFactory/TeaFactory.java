package com.learn.demo7_factory.simpleFactory;


import org.apache.commons.lang.StringUtils;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/5 21:10
 */
public class TeaFactory {

    public Tea creatTea(String type){
        if(StringUtils.equals(type, "red")){
            return new RedTea();
        }else if(StringUtils.equals(type, "green")){
            return new GreenTea();
        }else{
            throw new RuntimeException("type error");
        }
    }
}


