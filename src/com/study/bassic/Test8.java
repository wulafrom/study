package com.study.bassic;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-09-28 14:01
 */
public class Test8 {

    static {
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

    /**
     * 数组元素一个一个遍历，比较
     */
    @Test
    public void testSerach(){
        int a = 4;
        for (int i = 0; i < Constans.DATA.length; i++) {
            if (Constans.DATA[i]==0){
                System.out.println("数组包含: "+a);
                return;
            }
        }
        System.out.println("数组不包含: "+a);
    }

    @Test
    public void binarySearch(){
        int a = 4;
        int low  = 0;
        int upper = Constans.LENGTH-1;
        while (low<=upper){
            int mid= (low+upper)/2;
            if(Constans.DATA[mid]<a){
                low = mid+1;
            }else if(Constans.DATA[mid]>a){
                upper = mid-1;
            }else {
                System.out.println("数组存在数据: "+a);
                return;
            }
        }
        System.out.println("数组不存在数据: "+a);
    }


    @Test
    public void testJavaMethods(){
        //java 的快速选择排序
        Arrays.sort(Constans.DATA);
        int i = Arrays.binarySearch(Constans.DATA, 6);
        System.out.println(i);

    }

}
