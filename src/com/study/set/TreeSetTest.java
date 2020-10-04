package com.study.set;

import java.util.*;
import com.study.map.Student;
/**
 |--Set<E>,无序(不是索引顺序，因为没有索引),唯一。
 |--HashSet<E>,有一个特定顺序
 底层是哈希表结构。(顺序表+链表)
 如何存储元素对象的？
 执行hashCode方法，计算对象的哈希值。
 哈希值不同  -> 直接存。
 哈希值相同  -> 执行equals方法。
 ->false  存储
 ->true   不存。
 遇到哈希字样，就是快，非常快，神奇的快。

 |--TreeSet<E>,能给元素进行“自然排序”
 底层是二叉树结构。小值在左，大值在右


 以下是解释TreeSet如何存储的元素，如何给元素进行排序


 Comparable<T>,
 此接口强行对实现它的每个类的对象进行整体排序。
 这种排序被称为类的自然排序，类的 compareTo 方法被称为它的自然比较方法。

 int compareTo(T o)  比较此对象与指定对象的顺序。
 ---------------------------------------------

 Comparator<T>
 int compare(T o1, T o2) 比较用来排序的两个参数。
 boolean equals(Object obj) 指示某个其他对象是否“等于”此 Comparator。


 1.集合TreeSet
 集合本身没有比较方式。
 如果给集合TreeSet一个比较方式的话，我们可以向TreeSet构造器传入一个“比较器”

 “比较器”--Comparator<T>

 2.元素对象
 想要让元素对象具备比较性，让元素对象类模板实现Comparable<T>接口
 重写compareTo方法，建立元素对象自身的比较方式--"自然排序"


 集合和元素都有比较方式，按照集合的比较器为主。
 */
/*
 * 需求：按age排序。
 */
class MyComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		int num = o1.getAge() - o2.getAge();
		return num==0? o1.getName().compareTo(o2.getName()) : num;
	}
}

public class TreeSetTest {
	public static void main(String[] args) {
//		TreeSet<String> ts = new TreeSet<String>();
//		ts.add("tttt");
//		ts.add("xxxx");
//		ts.add("bbbb");
//		ts.add("kkkk");


//		TreeSet<Student> ts = new TreeSet<Student>();
//		TreeSet<Student> ts = new TreeSet<Student>(new MyComparator());

		TreeSet<Student> ts = new TreeSet<Student>(
				new Comparator<Student>(){
					@Override
					public int compare(Student o1, Student o2) {
						int num = o1.getAge() - o2.getAge();
						return num==0? o1.getName().compareTo(o2.getName()) : num;
					}
				}

		);
		ts.add(new Student("周7",23));
		ts.add(new Student("周2",23));
		ts.add(new Student("周2",45));
		ts.add(new Student("周5",23));

		System.out.println(ts);

	}
}
