package com.study.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-05 15:24
 */
public class FileTest {
    private  static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy年MM月dd日 EEE HH:mm:ss");

    public static void main(String[] args) {
        String filePath = "01test.avi";
        String filePaths = "G:\\work\\workspace\\5idea_test\\study\\01test.avi";
        File file = new File(filePath);
        File files = new File(filePaths);
        System.out.println("该地址的文件或者目录是否存在 " + files.exists());
        System.out.println("该地址的文件或者目录是否存在 " + file.exists());
        System.out.println("该对象指向的是文件吗 " + file.isFile());
        System.out.println("是目录吗 " + file.isDirectory());
        System.out.println("名称 " + file.getName());
        System.out.println("相对路径 " + file.getPath());
        System.out.println("绝对路径 " + file.getAbsolutePath());
        System.out.println("最后修改时间 " + SIMPLE_DATE_FORMAT.format(new Date(file.lastModified())));
        System.out.println("文件大小 " + file.length() + " 字节");
    }
}
