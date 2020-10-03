package com.study.bassic;

/**
 * @version V1.0
 * @Description: 分支语句
 * @author: h'mm
 * @date: 2020-09-26 18:11
 */
public class Test2 {
    public static void main(String[] args) {

        ifTest();
        switchTest();
    }

    public static void ifTest() {
        if (1 > 0) {
            System.out.println("1大于0");
        }
        if (1 < 0) {
            System.out.println("1小于0");
        } else {
            System.out.println("1大于0");
        }
        if (1 > 1) {
            System.out.println("1>1");
        } else if (1 < 1) {
            System.out.println("1<1");
        } else {
            System.out.println("1=1");
        }
    }

    public static void switchTest() {
        int achievement = 80;
        switch (achievement) {
            case 90:
                System.out.println("A");
                break;
            case 80:
                System.out.println("B");
                break;
            case 70:
                System.out.println("C");
                break;
            case 60:
                System.out.println("D");
                break;
            default:
                System.out.println("E");
                break;
        }
    }

}
