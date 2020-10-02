package com.study.list;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-02 21:03
 */
public class Generic<T> {
    private T t;

    public Generic() {

    }

    public Generic(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Generic{" + "t=" + t + '}';
    }

    public static void main(String[] args) {
        Generic<String> stringGeneric = new Generic<>();
        stringGeneric.t = "测试泛型";
        System.out.println(stringGeneric);
    }
}
