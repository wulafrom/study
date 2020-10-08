package com.study.thread;

import java.util.concurrent.*;

import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-08 16:39
 */
public class ExecutorServiceDemo {

    public static void main(String[] args) {
        int min = 4;
        int max = 10;
        ExecutorService es = new ThreadPoolExecutor(min, max,
                60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        for (int i = 0; i < 6; i++) {
            es.submit(new ExecutorServiceDemo().new TaskDemo(" " + i));
        }
    }

    class TaskDemo implements Runnable {
        private String name;

        public TaskDemo(String s) {
            this.name = s;
        }

        @Override
        public void run() {
            System.out.println("start task " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("end task " + name);
        }
    }
}
