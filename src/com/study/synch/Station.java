package com.study.synch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-08 14:35
 */
public class Station implements Runnable {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private static Integer ticket = 1000;

    @Override
    public synchronized void run() {
        while (true) {
            if (ticket > 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                logger.info("当前" + Thread.currentThread().getName() + " 售出第 " + ticket + " 票");
                ticket--;
            } else {
                break;
            }
        }
    }

    //方法锁的两种写法 在方法中 或者是进入方法体第一行
    public synchronized void run2() {
        //synchronized (this) {
        while (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("当前" + Thread.currentThread().getName() + "售出第 " + ticket + " 票");
            ticket--;
        }
        //}
    }


    public void run4() {
        ThreadLocal<Integer> ticket = new ThreadLocal<>();
        ticket.set(10);
        while (true) {
            if (ticket.get() > 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("当前" + Thread.currentThread().getName() + "售出第 " + ticket.get() + " 票");
                ticket.set(ticket.get() - 1);
            } else {
                break;
            }
        }
    }

    //@Override
    public void run5() {
        ticket = 10;
        while (true) {
            if (ticket > 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("当前" + Thread.currentThread().getName() + "售出第 " + ticket + " 票");
                ticket--;
            } else {
                break;
            }
        }
    }
}
