package com.study.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-02 22:15
 */
public class IteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("edf");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
