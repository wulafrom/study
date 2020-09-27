import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @version V1.0
 * @Description:
 * @author: humm
 * @date: 2020-09-27 15:33
 */
public class Test5 {

    private String testName;

    private Test5(String testName){
        this.testName = testName;
    }

    @Test
    public void testWork1() {
        System.out.println(getMileage(10));
        System.out.println(getHigh(10));
    }

    public double getMileage(int times) {
        double mileage = 100;
        for (int i = 1; i < times; i++) {
            mileage += mileage / Math.pow(2, i - 0);
        }
        return mileage;
    }

    public double getHigh(int times) {
        return 100 / Math.pow(2, times);
    }


    @Test
    public void testPrimeNumber() {
        List<Integer> primeNumber = new ArrayList<Integer>();
        for (int a = 101; a <= 200; a++) {
            for (int b = 2; b < a; b++) {
                if (a % b == 0) {
                    break;
                }else {
                    primeNumber.add(a);
                    break;
                }
            }
        }
        Iterator<Integer> iterator = primeNumber.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ,");
        }
    }

    @Test
    public void testMultiplication(){
        for (int a = 1;a<=9;a++){
            for (int b=1;b<=a;b++){
                System.out.print(a+" * "+b+" ="+a*b+"  ");
            }
            System.out.println();
        }
    }

}
