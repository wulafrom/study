package com.study.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-04 20:27
 */
public class Test {
    public String[] createArray(int length) throws MyException {
        if(length<0){
            throw new MyException("数组长度小于0");
        }
        return new String[length];
    }
    public static void main(String[] args){
        Test test = new Test();
        try {
            String[] array = test.createArray(2);
            array[0] = "创建成功";
        } catch (MyException e) {
            e.printStackTrace();
        }
        System.out.println(test.validationCard("420322199509126313"));
    }
    public boolean validationCard(String cardId){
        try {
            String regexCardId = "(^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$)|(^[1-9]\\d{5}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}$)";
            Pattern pattern = Pattern.compile(regexCardId);
            Matcher matcher = pattern.matcher(cardId);
            if(!matcher.matches()){
                throw new MyException("身份证号输入有误");
            }
            return true;
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
}
