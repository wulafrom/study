package com.study.bassic;

import org.testng.annotations.Test;

/**
 * @version V1.0
 * @Description:
 * @author: humm
 * @date: 2020-09-28 15:52
 */
public class Test10 {

    @Test
    public void testStaticAssignment() {
        //1.声明和创建
        int[][] a = new int[3][3];
        int[][] b = new int[3][];
        b[0] = new int[5];
        b[1] = new int[6];
        b[2] = new int[7];
        //2.声明静态初始化
        int[][] c = new int[][]{{1, 2}, {1, 2, 3, 4, 8}, {9, 8, 4, 2}};
        int[][] d = {{1, 2}, {1, 2, 3, 4, 8}, {9, 8, 4, 2}};
        //3.动态初始化
        a[0][0] = 3;
        b[0][4] = 4;
        //4.二维数组的访问
        for (int[] ints : c) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }
}
