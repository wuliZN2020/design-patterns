package com.learn.demo7_factory.simpleFactory;

import com.learn.demo7_factory.system.GreenTea;
import com.learn.demo7_factory.system.RedTea;
import com.learn.demo7_factory.system.Tea;
import org.apache.commons.lang.StringUtils;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/5 21:13
 */
public class StaticTeaFactory {
    public static Tea creatTea(String type){
        if(StringUtils.equals(type, "red")){
            return new RedTea();
        }else if(StringUtils.equals(type, "green")){
            return new GreenTea();
        }else{
            throw new RuntimeException("type error");
        }
    }
}


