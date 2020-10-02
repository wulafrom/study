package com.study.commonlyobject;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-02 13:39
 */
public class Test {
    public static void main(String[] args){
        EnumTest red = EnumTest.RED;
        System.out.println(red);
        System.out.println(red.getIndex());
        System.out.println(red.getName());
        System.out.println(EnumTest.getName(2));
        System.out.println(red);
        
    }
}
