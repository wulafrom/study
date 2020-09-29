package com.study.commonlyobject;

/**
 * @version V1.0
 * @Description: String类解析
 * @author: humm
 * @date: 2020-09-29 21:36
 */
public class StringTest {

    public static void main(String[] args) {
        String s1 = "ab";
        System.out.println("s1 " + s1.hashCode());
        String s2 = "cd";
        System.out.println("s2 " + s2.hashCode());
        String s12 = "abcd";
        System.out.println("s12 " + s12.hashCode());
        String s3 = "ab" + "cd";
        System.out.println("s3 " + s3.hashCode());
        String s4 = s1 + "cd";
        System.out.println("s4 " + s4.hashCode());
        String s5 = s1 + s2;
        System.out.println("s5 " + s5.hashCode());
        System.out.println("s12==s3 " + (s12 == s3));
        System.out.println("s12==s4 " + (s12 == s4));
        System.out.println("s12==s5 " + (s12 == s5));
    }

}
