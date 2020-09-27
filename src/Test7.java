import org.testng.annotations.Test;

/**
 * @version V1.0
 * @Description: 数组排序
 * @author: humm
 * @date: 2020-09-27 21:19
 */
public class Test7 {
    private static int[] data = {10, 5, 34, 54, 88, 56, 12, 78, 6, 1, 8, 45};
    private static int length;

    static {
        length = data.length;
    }

    /**
     * 1.选择排序
     * 升序：
     * 第一轮：默认第一个是最小的，然后开始比较，碰到比第一个小的就把当前的位置标记为最小，直至到最后一个元素，
     * 则找到了最小的元素，然后把第一个元素和当前最小的的元素互换位置。
     * 第一次 data[0]>data[1] ,data[1]>data[2] ,data[2]>data[3] ,data[3]>data[4] ,data[4]>data[5] ..........
     * 第二次 data[1]>data[2] ,data[2]>data[3] ,data[3]>data[4] ,data[4]>data[5]...........
     * 第三次 data[2]>data[3] ,data[3]>data[4] ,data[4]>data[5]..........  
     */
    @Test
    public void selectionSort() {
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        Test6.iterator(data);
    }

    /**
     * 2.冒泡排序  把最小的或者最大数的把到最后
     * 比较前后相邻的二个数据，如果前面数据大于后面的数据，就将这二个数据交换。
     * 第一会把最大的数排到最后去
     * 第一次 data[0]<data[1] ,data[1]<data[2] ,data[2]<data[3] ,data[3]<data[4] ,data[4]<data[5] ..........
     * 第二次 data[0]<data[1] ,data[1]<data[2] ,data[2]<data[3] ,data[3]<data[4] ,data[4]<data[5] ..........
     * 第三次 data[0]<data[1] ,data[1]<data[2] ,data[2]<data[3] ,data[3]<data[4] ,data[4]<data[5] ..........
     */
    @Test
    public void bubbleSort() {
        for (int i = 1; i < length; i++) {//定义比较的次数
            for (int j = 0; j < length - i; j++) {
                if (data[j + 1] < data[j]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        Test6.iterator(data);
    }

    /**
     * 3.插入排序
     * 从数组的第一个元素a[0]开始，将其后一个元素a[1]插入到a[0]的前面或者后面，
     * 接着继续这一过程。每次都是将a[i]插入到已经排序好的
     * 本质是比较，比它大，就放后面(不动)，比它小，就放前面
     * 
     * 从后往前比较，后面比前面小，换位置
     * 比较顺序
     * 第一次 data[0]>data[1]
     * 第二次 data[1]>data[2] ,data[0]>data[1] 
     * 第三次 data[2]>data[3] ,data[1]>data[2] ,data[0]>data[1] 
     */
    @Test
    public static void insertSort() {
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (data[j - 1] > data[j]) {
                    int temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        Test6.iterator(data);
    }

}
