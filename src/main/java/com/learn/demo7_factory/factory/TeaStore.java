package com.learn.demo7_factory.factory;

import lombok.Data;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/9 21:30
 */
@Data
public class TeaStore {

    private TeaFactory teaFactory;

    public Tea orderTea(){
        Tea tea = teaFactory.getTea();
        tea.addMilk();
        tea.addSugar();
        return tea;
    }
}


