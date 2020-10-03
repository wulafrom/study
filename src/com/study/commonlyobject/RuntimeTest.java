package com.study.commonlyobject;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-01 14:49
 */
public class RuntimeTest {

    public static void main(String[] args){
        Runtime runtime = Runtime.getRuntime();
        System.out.println("处理器的数量: "+runtime.availableProcessors());
        System.out.println("空闲内存: "+runtime.freeMemory());
        System.out.println("总内存数: "+runtime.totalMemory());
        System.out.println("可用最大内存书: "+runtime.maxMemory());
    }
}
