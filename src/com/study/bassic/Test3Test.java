package com.study.bassic;

import org.junit.jupiter.api.Test;

/**
 * @version V1.0
 * @Description:循环语句
 * @author: humm
 * @date: 2020-09-27 15:01
 */
public class Test3Test {
    public static void main(String[] args) {
    }

    /**
     * 不能使用静态的
     */
    @Test
    public void testDoWhile() {
        int a = 10;
        do {
            a++;
            System.out.println(a);
        } while (a < 20);
        System.out.println(a);
    }

    @Test
    public void testFor() {
        int b = 10;
        for (int a = 0; a < b; a++) {
            System.out.println(a);
        }
    }

    @Test
    public void testWhile() {
        int a = 0;
        int b = 10;
        while (a < b) {
            a++;
        }
        System.out.println(a);
    }

    @Test
    public void testTwiceLoop() {
        int num = 5;
        for (int a = 1; a <= num; a++) {
            for (int b = 1; b <= num; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    public void testCreate() {
        //1.静态初始化
        int[] a = new int[]{1, 2, 3};
        int[] b = {1, 2, 3};
        //2.动态初始化
        int[] c = new int[3];
        c[0] = 1;
        c[1] = 2;
        c[2] = 3;
        //3.便利数组
        iterator(a);
        iterator(b);
        iterator(c);
    }

    private void iterator(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
