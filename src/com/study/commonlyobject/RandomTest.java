package com.study.commonlyobject;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @version V1.0
 * @Description:
 * @author: humm
 * @date: 2020-10-01 13:53
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt();
        System.out.println(r);
        for (int i = 1; i <= 5; i++) {
            int i1 = 1 + random.nextInt(5);
            System.out.println(i1);
        }
        double nextDouble = random.nextDouble();
        System.out.println(nextDouble);
        long nextLong = random.nextLong();
        System.out.println(nextLong);

        int randomNumber = 0;
        for (int i = 1; i <= 3; i++) {
            int nextInt = random.nextInt(10);
            randomNumber = randomNumber * 10 + nextInt;
        }
        System.out.println(randomNumber);
    }
}
