package com.learn.demo5;

/**
 * @author ：zhangna
 * @description：TODO
 * @date ：2025/1/2 22:15
 */
public class Client {

    public static void main(String[] args) {
        Agent agent = new Agent();

        agent.setStar(new Star("张三")).setFans(new Fans("李四")).setCompany(new Company("传媒公司"));

        agent.meeting();

        agent.talking();
    }
}


