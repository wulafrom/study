package com.study.bassic;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-09-28 15:37
 */
public class Test9 {

    @Test
    public void testArrayCopy() {
        int[] dest = new int[12];
        System.arraycopy(Constans.DATA,0,dest,0,12);
        System.out.println(Arrays.toString(dest));
    }
}
