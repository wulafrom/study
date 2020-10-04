package com.study.bassic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-09-27 15:33
 */
public class Test5Test {

    private Test5Test(String testName) {
    }

    @Test
    public void testWork1() {
        System.out.println(getMileage(10));
        System.out.println(getHigh(10));
    }

    public double getMileage(int times) {
        double mileage = 100;
        for (int i = 1; i < times; i++) {
            mileage += mileage / Math.pow(2, i);
        }
        return mileage;
    }

    public double getHigh(int times) {
        return 100 / Math.pow(2, times);
    }


    @Test
    public void testPrimeNumber() {
        List<Integer> primeNumber = new ArrayList<Integer>();
        int num1 = 101;
        int num2 = 200;
        for (int a = num1; a <= num2; a++) {
            int start = 2;
            for (int b = start; b < a; b++) {
                if (a % b != 0) {
                    primeNumber.add(a);
                }
                break;
            }
        }
        for (Integer integer : primeNumber) {
            System.out.print(integer + " ,");
        }
    }

    @Test
    public void testMultiplication() {
        int upper = 9;
        for (int a = 1; a <= upper; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(a + " * " + b + " =" + a * b + "  ");
            }
            System.out.println();
        }
    }

}
