package com.study.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-04 16:43
 */
public class MapTest {
    public static void main(String[] args){
        Map<Integer,Student> hashMap = new HashMap(16);
        Student student = new Student("王都铎",28);
        Student student2 = new Student("Kris",26);
        hashMap.put(101,student2);
        hashMap.put(100,student);
        Set<Map.Entry<Integer, Student>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, Student> entry : entries) {
            System.out.print(entry.getKey()+"\t");
            System.out.println(entry.getValue());
        }
        Map<Integer,Student> treeMap = new TreeMap();
        treeMap.put(101,student2);
        treeMap.put(100,student);
        Set<Integer> set = treeMap.keySet();
        for (Integer id : set) {
            System.out.print(id+"\t");
            System.out.println(treeMap.get(id));
        }
    }
}
