package com.study.cas;

import java.util.concurrent.CountDownLatch;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-04 15:56
 */
public class VolatileTest {

    public static volatile int race = 0;

    private static final int THREADS_COUNT = 20;

    private static CountDownLatch countDownLatch = new CountDownLatch(THREADS_COUNT);

    public static void increase() {
        race++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[THREADS_COUNT];
        for (int i = 0; i < THREADS_COUNT; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        increase();
                    }
                    countDownLatch.countDown();
                }
            });
            threads[i].start();
        }
        countDownLatch.await();
        System.out.println(race);
    }
}