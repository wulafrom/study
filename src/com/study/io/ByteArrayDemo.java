package com.study.io;

import com.sun.org.apache.xpath.internal.operations.String;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-07 1:01
 */
public class ByteArrayDemo {

    @Test
    public void test() {
        java.lang.String temp = "abcdefg";
        byte[] bytes = temp.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        tranForm(bais, baos);
        byte[] byteArray = baos.toByteArray();
        java.lang.String s = new java.lang.String(byteArray);
        System.out.println(s);
    }

    private static void tranForm(ByteArrayInputStream bais, ByteArrayOutputStream baos) {
        int c = 0;
        while ((c = bais.read()) != -1) {
            baos.write(c);
        }

    }
}
