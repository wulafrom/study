package com.study.io;

import org.testng.annotations.Test;

import java.io.*;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-05 21:51
 */
public class StreamDemo {


    /**
     * 输出流
     *
     * @Description:
     * @Param: []
     * @Return: void
     * @Author: h'mm
     * @version V1.0
     * @Date: 2020-10-05 22:02
     */
    @Test
    private void fileOutputDemo() {
        OutputStream os = null;
        try {
            File file = new File("01.txt");
            os = new FileOutputStream(file);
            byte[] bt = "Hello Word".getBytes();
            os.write(bt);
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取文件内容
     *
     * @Description:
     * @Param: []
     * @Return: void
     * @Author: h'mm
     * @version V1.0
     * @Date: 2020-10-05 22:03
     */
    @Test
    private void fileInputDemo() {
        InputStream is = null;
        try {
            File file = new File("01.txt");
            is = new FileInputStream(file);
            byte[] bt = new byte[1024];
            int readLength = is.read(bt);
            System.out.println(readLength);
            System.out.println(new String(bt, 0, readLength));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    private void FileWriterDemo() {
        Writer fw = null;
        try {
            File file = new File("01.txt");
            fw = new FileWriter(file, true);
            fw.write("\nHello Writer");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    private void FileReaderDemo() {
        Reader fr = null;
        try {
            File file = new File("01.txt");
            fr = new FileReader(file);
            char[] chars = new char[1024];
            int read = fr.read(chars);
            System.out.println(read);
            System.out.println(new String(chars));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
