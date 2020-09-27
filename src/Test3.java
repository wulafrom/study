import org.junit.jupiter.api.Test;

/**
 * @version V1.0
 * @Description:循环语句
 * @author: humm
 * @date: 2020-09-27 15:01
 */
public class Test3 {
    public static void main(String[] args) {
    }

    //不能使用静态的
    @Test
    public void testDoWhile() {
        int a = 10;
        do {
            a++;
            System.out.println(a);
        } while (a < 20);
        System.out.println(a);
    }

    @Test
    public void testFor() {
        int a;
        for (a = 0; a < 10; a++) {
            System.out.println(a);
        }
        System.out.println(a);
    }

    @Test
    public void testWhile() {
        int a = 0;
        while (a < 10) {
            a++;
        }
        System.out.println(a);
    }

    @Test
    public void testTwiceLoop() {
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    public void testCreate() {
        //1.静态初始化
        int[] a = new int[]{1, 2, 3};
        int[] b = {1, 2, 3};
        //2.动态初始化
        int[] c = new int[3];
        c[0] = 1;
        c[1] = 2;
        c[2] = 3;
        //3.便利数组
        iterator(a);
        iterator(b);
        iterator(c);
    }

    private void iterator(int[] a) {
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
