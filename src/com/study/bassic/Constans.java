package com.study.bassic;

/**
 * @version V1.0
 * @Description:
 * @author: humm
 * @date: 2020-09-28 14:07
 */
public class Constans {
    public static int[] DATA = {10, 5, 34, 54, 88, 56, 12, 78, 6, 1, 8, 45};
    public static int LENGTH;

    static {
        LENGTH = Constans.DATA.length;
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
    }
}
