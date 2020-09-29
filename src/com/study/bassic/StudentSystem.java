package com.study.bassic;

/**
 * @version V1.0
 * @Description:
 * @author: humm
 * @date: 2020-09-28 21:52
 */
public class StudentSystem {
    private static Integer size = 0;
    private static Object[][] students = new Object[10][4];


    public void addStudet(Integer id, String name, Integer age, String gender) {
        if (size == students.length) {
            Object[][] temp = new Object[students.length*2][4];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[size][0] = id;
        students[size][1] = name;
        students[size][2] = age;
        students[size][3] = gender;
    }

    public static void main(String[] args) {
        students[0][0] = 1001;
        students[0][1] = "lei";
        students[0][2] = "men";
        students[0][3] = 25;
        Object[][] sts = new Object[20][4];
        System.arraycopy(students, 0, sts, 0, students.length);
        for (int i = 0; i < sts.length; i++) {
            System.out.println(sts[i][0]);
            System.out.println(sts[i][1]);
            System.out.println(sts[i][2]);
            System.out.println(sts[i][3]);
        }
    }

}
