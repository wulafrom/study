package com.study.commonlyobject;

import org.testng.annotations.Test;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @version V1.0
 * @Description:
 * @author: humm
 * @date: 2020-10-01 15:15
 */
public class CalendarTest {

    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        Calendar gregorianCalendar = new GregorianCalendar();

        System.out.println(calendar.get(Calendar.YEAR));
        //一年中的第一个月是 0
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
    }


    @Test
    public void testCalculateDay(){
        LocalDate localDate = LocalDate.of(2005, 4, 5);
        long l = localDate.toEpochDay();
        LocalDate now = LocalDate.now();
        long l1 = now.toEpochDay();
        System.out.println(l1-l);

    }
}
