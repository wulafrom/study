package com.study.abstracttest;

/**
 * @version V1.0
 * @Description: 人的实现
 * @author: h'mm
 * @date: 2020-10-02 15:06
 */
public class Person implements Runner {
    @Override
    public void start() {
        System.out.println("主备工作开始");
    }

    @Override
    public void run() {
        System.out.println("开始工作");
    }

    @Override
    public void stop() {
        System.out.println("停止工作");
    }
}
