package com.study.commonlyobject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-01 15:02
 */
public class SimpleDateFormatTest {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        System.out.println(simpleDateFormat.format(date));
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd日 EEE HH:mm:ss");
        System.out.println(simpleDateFormat1.format(date));
        Date date2 = simpleDateFormat1.parse("2015年04月01日星期一 08:08:08");
        System.out.println(date2.toString());

    }
}
