package com.study.synch;

import org.testng.annotations.Test;


/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-08 14:41
 */
public class TestStation {
    public static void main(String[] args) {
        Station station = new Station();

        Thread thread1 = new Thread(station, "窗口1");
        Thread thread2 = new Thread(station, "窗口2");
        Thread thread3 = new Thread(station, "窗口3");
        Thread thread4 = new Thread(station, "窗口4");
        Thread thread5 = new Thread(station, "窗口5");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }

    @Test
    public void test() {

        ThreadLocal<Integer> ticket = new ThreadLocal<>();
        ticket.set(10);


    }

    static void log(String s) {
        System.out.println(Thread.currentThread().getName() + ": " + s);
    }
}
