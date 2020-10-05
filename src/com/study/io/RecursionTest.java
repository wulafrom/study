package com.study.io;

import java.io.File;

/**
 * @version V1.0
 * @Description: 递归 查看文件层级
 * @author: h'mm
 * @date: 2020-10-05 15:43
 */
public class RecursionTest {

    public static void listChild(File file, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(file.getName());
        File[] childs = file.listFiles();
        if (null != childs && childs.length != 0) {
            for (File fileChild : childs) {
                listChild(fileChild, level + 1);
            }
        }

    }

    public static void main(String[] args) {
        File file = new File("E:\\其他文档");
        listChild(file, 0);
    }
}
