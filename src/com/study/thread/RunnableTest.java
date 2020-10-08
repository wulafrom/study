package com.study.thread;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-08 12:53
 */
public class RunnableTest {
    public static void main(String[] args){
        new Thread(new RunnableTest().new RunnableDemo()).start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main 在运行");
        }
    }
    class RunnableDemo implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("Runnable 在运行");
            }
        }
    }
}
