package com.study.io;

import org.testng.annotations.Test;

import java.io.*;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-06 14:24
 */
public class Work {

    @Test
    public void work1() {
        BufferedWriter bw = null;
        try {
            File dir = new File("D:\\test3");
            if (dir.exists()) {
                dir.mkdir();
            }
            File file = new File(dir.getAbsolutePath() + "\\Stream.txt");
            file.createNewFile();

            bw = new BufferedWriter(new FileWriter(file, true));
            bw.newLine();
            bw.write("我叫hmm,性别男，出生年月:202020");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void BufferReaderTest() {
        BufferedReader br = null;
        try {
            File file = new File("D:\\test3\\Stream.txt");
            br = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = br.readLine();
                if (null == readLine) {
                    break;
                }
                System.out.println(readLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
