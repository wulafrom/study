import org.junit.jupiter.api.Test;

/**
 * @version V1.0
 * @Description:
 * @author: humm
 * @date: 2020-09-27 15:18
 */
public class Test4Test {

    @Test
    public void testBraek() {
        int[] a = {1, 2, 3};
        for (int b : a) {
            if (b == 2) {
                break;
            }
            System.out.println(b);
        }
    }
    @Test
    public void testContinue() {
        int[] a = {1, 2, 3};
        for (int b : a) {
            if (b == 2) {
                continue;
            }
            System.out.println(b);
        }
    }
}
