package com.study.commonlyobject;

import jdk.nashorn.internal.objects.NativeJSON;

import java.util.Properties;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-01 14:06
 */
public class SystemTest {

    public static void main(String[] args) throws InterruptedException {
        long before = System.currentTimeMillis();
        Thread.sleep(1000);
        long after = System.currentTimeMillis();
        System.out.println(after-before);

        Properties properties = System.getProperties();
        for(String keyName:properties.stringPropertyNames()){
            System.out.println(keyName+" --> "+properties.getProperty(keyName));
        }
    }
}
