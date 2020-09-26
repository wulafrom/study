import java.util.HashMap;
import java.util.Map;

/**
 * @version V1.0
 * @Description:
 * @author: humm
 * @date: 2020-09-26 17:28
 */
public class Test1 {
    public static void main(String[] args) {
        //1.计算剩余周数和天数
        Map<String, Integer> remaining = getRemaining(46);
        System.out.println("剩余周数: " + remaining.get("remainingWeek"));
        System.out.println("剩余天数: " + remaining.get("remainingDay"));
        //2.计算圆面积
        System.out.println(getArea(5));
        //3.i++ 和 ++i
        testAdd();
        testAdds();
    }

    /**
     * 计算剩余的周数和天数
     *
     * @param number
     * @return
     */
    public static Map<String, Integer> getRemaining(Integer number) {
        Map<String, Integer> remaining = new HashMap<>();
        remaining.put("remainingWeek", number / 7);
        remaining.put("remainingDay", number - (number / 7) * 7);
        return remaining;
    }

    public static double getArea(double radius) {
        double area = radius * radius * 3.14f;
        return area;
    }

    public static void testAdd() {
        int a = 0;
        int i = 0;
        a = i++;
        System.out.println(a);
    }

    public static void testAdds() {
        int a = 0;
        int i = 0;
        a = ++i;
        System.out.println(a);
    }
}
