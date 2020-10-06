package com.study.io;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-06 14:04
 */
public class BufferReaderDemo {

    @Test
    private void testBufferReader() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String readLine = null;

        while (true) {
            System.out.println("输入数字");
            try {
                readLine = br.readLine();
                Stream<String> lines = br.lines();
                int i = Integer.parseInt(readLine);
                i++;
                System.out.println("修改后的数字是:"+i);
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
