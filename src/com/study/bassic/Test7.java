package com.study.bassic;

import org.testng.annotations.Test;

/**
 * @version V1.0
 * @Description: 数组排序
 * @author: h'mm
 * @date: 2020-09-27 21:19
 */
public class Test7 {
    

    /**
     * 1.选择排序 第一次全部比较
     * 升序：
     * 第一轮：默认第一个是最小的，然后开始比较，碰到比第一个小的就把当前的位置标记为最小，直至到最后一个元素，
     * 则找到了最小的元素，然后把第一个元素和当前最小的的元素互换位置。
     * 第一次 data[0]>data[1] ,data[1]>data[2] ,data[2]>data[3] ,data[3]>data[4] ,data[4]>data[5] ..........
     * 第二次 data[1]>data[2] ,data[2]>data[3] ,data[3]>data[4] ,data[4]>data[5]...........
     * 第三次 data[2]>data[3] ,data[3]>data[4] ,data[4]>data[5]..........  
     */
    @Test
    public void selectionSort() {
        for (int i = 0; i < Constans.LENGTH; i++) {
            for (int j = i + 1; j < Constans.LENGTH; j++) {
                if (Constans.DATA[i] > Constans.DATA[j]) {
                    int temp = Constans.DATA[i];
                    Constans.DATA[i] = Constans.DATA[j];
                    Constans.DATA[j] = temp;
                }
            }
        }
        Test6Test.iterator(Constans.DATA);
    }

    /** 每次一循环 都是全部进行比较
     * 2.冒泡排序  把最小的或者最大数的把到最后
     * 比较前后相邻的二个数据，如果前面数据大于后面的数据，就将这二个数据交换。
     * 第一会把最大的数排到最后去
     * 第一次 data[0]<data[1] ,data[1]<data[2] ,data[2]<data[3] ,data[3]<data[4] ,data[4]<data[5] ..........
     * 第二次 data[0]<data[1] ,data[1]<data[2] ,data[2]<data[3] ,data[3]<data[4] ,data[4]<data[5] ..........
     * 第三次 data[0]<data[1] ,data[1]<data[2] ,data[2]<data[3] ,data[3]<data[4] ,data[4]<data[5] ..........
     */
    @Test
    public void bubbleSort() {
        //定义比较的次数
        for (int i = 1; i < Constans.LENGTH; i++) {
            for (int j = 0; j < Constans.LENGTH - i; j++) {
                if (Constans.DATA[j + 1] < Constans.DATA[j]) {
                    int temp = Constans.DATA[j];
                    Constans.DATA[j] = Constans.DATA[j + 1];
                    Constans.DATA[j + 1] = temp;
                }
            }
        }
        Test6Test.iterator(Constans.DATA);
    }

    /**
     * 3.插入排序  第一次只比较 头两个
     * 从数组的第一个元素a[0]开始，将其后一个元素a[1]插入到a[0]的前面或者后面，
     * 接着继续这一过程。每次都是将a[i]插入到已经排序好的
     * 本质是比较，比它大，就放后面(不动)，比它小，就放前面
     * 
     * 从后往前比较，后面比前面小，换位置
     * 比较顺序
     * 第一次 data[0]>data[1]
     * 第二次 data[1]>data[2] ,data[0]>data[1] 
     * 第三次 data[2]>data[3] ,data[1]>data[2] ,data[0]>data[1] 
     */
    @Test
    public static void insertSort() {
        for (int i = 1; i < Constans.LENGTH; i++) {
            for (int j = i; j > 0; j--) {
                if (Constans.DATA[j - 1] > Constans.DATA[j]) {
                    int temp = Constans.DATA[j];
                    Constans.DATA[j] = Constans.DATA[j - 1];
                    Constans.DATA[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        Test6Test.iterator(Constans.DATA);
    }

}
