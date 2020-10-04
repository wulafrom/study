package com.study.commonlyobject;

/**
 * @version V1.0
 * @Description: 测试Object的方法
 * @author: h'mm
 * @date: 2020-09-29 15:02
 */
public class ObjectTest {

    /**
     * 属性名
     */
    private String filed;

    /**
     * @Description:
     * @Param: [text] 要打印的文本
     * @Return: java.lang.String
     * @Author: h'mm
     * @Date: 2020-09-29 17:32
     */
   public String testText(String text){
        System.out.println(text);
        return null;
    }

    @Override
    public String toString(){
       return this.filed;
    }

    @Override
    public boolean equals(Object obj){
       return this.filed.equals(obj.toString());
    }

    public static void main(String[] args){
        Object o = new Object();
        ObjectTest objectTest = new ObjectTest();
        String testText = objectTest.testText("测试实施");
    }
}
