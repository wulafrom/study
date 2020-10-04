package com.study.map;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-04 23:00
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    /**
     * 该方法就是所谓的"自然排序"
     * 需求：按name排序。
     */
    @Override
    public int compareTo(Student o) {
        System.out.println(this.name + "----vs----" +o.name);

        int num = this.name.compareTo(o.name);
        return num == 0 ? this.age - o.age : num;

//		return num == 0 ? new Integer(this.age).compareTo(new Integer(o.age)) : num;
    }


    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
     * 重写hashCode方法，建立子类特有的哈希值运算
     */
    @Override
    public int hashCode() {
        System.out.println(this.name+"..."+this.age);
        return 1;
    }


    /**
     * 重写equals方法，建立子类特有的比较方式
     * 需求：name和age都相同，视为同一对象。
     */
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Student))
            throw new ClassCastException("类型不匹配！！");

        Student stu = (Student)obj;
        return this.name.equals(stu.name) && this.age == stu.age;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }


}
