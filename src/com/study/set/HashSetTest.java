package com.study.set;

import java.util.*;
import com.study.map.Student;

/**
 * |--Set<E>,无序(不是索引顺序，因为没有索引),唯一。
 |--HashSet<E>,有一个特定顺序
 底层是哈希表结构。(顺序表+链表)
 如何存储元素对象的？
 执行hashCode方法，计算对象的哈希值。
 哈希值不同  -> 直接存。
 哈希值相同  -> 执行equals方法。
 ->false  存储
 ->true   不存。
 遇到哈希字样，就是快，非常快，神奇的快。

 子类：LinkedHashSet
 理解：有序的HashSet
 有序(存取顺序一致)，增删查询效率高。唯一。

 |--TreeSet<E>

 */
public class HashSetTest {
	/*
	 * 需求：name和age都相同，视为同一对象。
	 */
	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();

		/*
		 * 先执行Student  hashCode方法
		 */
		hs.add(new Student("周1",23));
		hs.add(new Student("周2",23));
		hs.add(new Student("周2",45));
		hs.add(new Student("周5",23));
		hs.add(new Student("周5",23));
		hs.add(new Student("周6",70));
		hs.add(new Student("周1",23));

		System.out.println(hs);
	}
}
