package com.study.work;

import com.study.utils.Gender;
import org.testng.annotations.Test;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-06 15:25
 */
public class Work2 {

    @Test
    public void work2() {
        List<TransRecord> list = getTransRecordList();
        Collections.sort(list);
        Iterator<TransRecord> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        TransRecord[] trs = new TransRecord[list.size()];
        list.toArray(trs);
        outPutBytes(trs);
    }

    public static List<TransRecord> getTransRecordList() {
        BufferedReader br = null;
        List<TransRecord> list = new ArrayList<>();
        try {
            File file = new File("D:\\test3\\Stream.txt");
            br = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = br.readLine();
                if (null == readLine) {
                    break;
                }
                addTranRecord(list, readLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    private static void addTranRecord(List<TransRecord> list, String readLine) {
        String[] split = readLine.split("\\|");
        String userid = split[0];
        String userName = split[1];
        String mechanismId = split[2];
        Gender gender = Objects.equals(split[3], "0") ? Gender.WOMAN : Gender.MAN;
        String account = split[4];
        Date happenDate = new Date(Long.parseLong(split[5]));
        BigDecimal dealMoney = new BigDecimal(split[6]);
        TransRecord transRecord = new TransRecord(userid, userName, mechanismId, gender, account, happenDate, dealMoney);
        list.add(transRecord);
    }

    private static void outPutBytes(TransRecord[] trs) {
        ObjectOutputStream oos = null;
        try {

            File file = new File("D:\\test3\\Stream2.txt");
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(trs);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
