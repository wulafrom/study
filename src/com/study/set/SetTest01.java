package com.study.set;

import java.util.*;

/**
 Collection<E>
 |--List<E>,有序(索引),可重复
 |--ArrayList<E>,数组。查询效率高(索引)
 |--LinkedList<E>,链表。增删效率高。


 |--Set<E>,无序(不是索引顺序，因为没有索引),唯一。
 |--HashSet<E>,有一个特定顺序
 |--TreeSet<E>

 Set接口没有自己特有的方法，都是Collection中的。
 */
public class SetTest01 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("yyyy");
		set.add("xxxx");
		set.add("zzzz");
		set.add("aaaa");

		//方式一：
		set.forEach(System.out::println);

		//方式二：
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//System.out.println(set);
	}

}
