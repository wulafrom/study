package com.study.bassic;

import org.junit.jupiter.api.Test;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-09-27 21:05
 */
public class Test6Test {
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

    public static void iterator(int[] a) {
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
