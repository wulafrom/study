package com.study.pool;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.study.synch.Station;
import javafx.beans.property.adapter.JavaBeanBooleanProperty;

import java.util.concurrent.*;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-09 14:21
 */
public class ThreadPoolDemo {
    public static void main(String[] args) throws NoSuchMethodException {
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("售卖车票线程-%d").build();
        //用于串行执行任务的场景，每个任务必须按顺序执行，不需要并发执行
        ExecutorService singleThreadPool = new ThreadPoolExecutor(1, 1,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());

        //会出现数据安全问题，即使加锁了
        ExecutorService fixThreadPool = new ThreadPoolExecutor(2, 5,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(1), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());

        Station s1 = new Station();
        Station s2 = new Station();
        Station s3 = new Station();
        Station s4 = new Station();
        Station s5 = new Station();

//        singleThreadPool.submit(s1);
//        singleThreadPool.submit(s2);
//        singleThreadPool.submit(s3);
//        singleThreadPool.submit(s4);
//        singleThreadPool.submit(s5);
        singleThreadPool.shutdown();


        fixThreadPool.submit(s1);
        fixThreadPool.submit(s2);
        fixThreadPool.submit(s3);
        fixThreadPool.submit(s4);
        fixThreadPool.submit(s5);
        fixThreadPool.shutdown();

    }



}