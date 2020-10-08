package com.study.thread;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-08 12:45
 */
public class ThreadTest {
    public static void main(String[] args) {
        // 通过new 类名().start();启动多线程。
        // 程序并不会在此处停止，而是继续执行，同时run()内的代码也开始执行。
        new TestThread().start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main 在运行");
        }
    }
    private static class TestThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("TestThread 在运行");
            }
        }
    }

    private class TestThreadLocal extends ThreadLocal{

    }
}
