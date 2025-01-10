package com.learn.demo7_factory.simpleFactory;

import java.io.InputStream;
import java.util.*;

/**
 * @author ：zhangna
 * @description：扩展简单工厂类：简单工厂+配置文件解除耦合
 * @date ：2025/1/5 21:15
 */
public class ExtentTeaFactory {

    private static Map<String, Tea> teaMap = new HashMap();

    static {
        Properties p = new Properties();
        InputStream in = ExtentTeaFactory.class.getClassLoader().getResourceAsStream("tea.properties");
        try {
            p.load(in);
            Set<String> keys = p.stringPropertyNames();
            for(String key : keys) {
                String className = p.getProperty(key);
                Class clazz = Class.forName(className);
                Tea tea = (Tea) clazz.newInstance();
                teaMap.put(key, tea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Tea createTea(String type) {
        return teaMap.get(type);
    }
}


