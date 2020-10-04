package com.study.abstracttest;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-02 15:03
 */
public interface Runner {

    int ID = 1;

    /**
     * 开始工作
     * @Description: 开始工作
     * @Param: []
     * @Return: void
     * @Author: h'mm
     * @version V1.0
     * @Date: 2020-10-02 15:04
     */
    void start();

    /**
     * 工作进行中
     * @Description: 工作进行中
     * @Param: []
     * @Return: void
     * @Author: h'mm
     * @version V1.0
     * @Date: 2020-10-02 15:05
     */
    void run();

    /**
     * 停止工作
     * @Description: 停止工作
     * @Param: []
     * @Return: void
     * @Author: h'mm
     * @version V1.0
     * @Date: 2020-10-02 15:05
     */
    void stop();

    /**
     * jdk1.8中 接口中可以定义 静态方法
     * @Description:
     * @Param: []
     * @Return: void
     * @Author: h'mm
     * @version V1.0
     * @Date: 2020-10-02 15:22
     */
    static void hello() {
        System.out.println("hello");
    }
}
