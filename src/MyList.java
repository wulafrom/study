import java.util.Arrays;

/**
 * @version V1.0
 * @Description:重写list类
 * @author: humm
 * @date: 2020-09-28 17:06
 */
public class MyList {
    /**
     * 存放对象的数组
     */
    private Object[] obj;
    /**
     * 数组的存放数据个数
     */
    private int size;
    /**
     * 数组默认的长度
     */
    private static final int DEFAULT_SIZE = 10;

    /**
     * 重写默认的构造方法
     */
    public MyList() {
        obj = new Object[DEFAULT_SIZE];
    }


    /**
     * @Description: 添加对象
     * @author: humm
     * @Param: 要保存的实例
     * @Return:
     * @Date: 2020-09-28 20:43
     */
    public void add(Object o) {
        try {
            if (size == this.obj.length) {
                Object[] temp = new Object[this.size + DEFAULT_SIZE];
                System.arraycopy(obj, 0, temp, 0, obj.length);
                obj = temp;

            }
            obj[size] = o;
            this.size++;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Mylist添加输出出错" + o.toString());
        } finally {
            System.out.println("数据添加成功" + o);
        }
    }

    /**
     * @Description:
     * @author: humm
     * @Param: 数组下摆哦
     * @Return: 存放数据
     * @Date: 2020-09-28 21:49
     */
    public Object getObject(int index) {
        try {
            if (index < 0 || index >= obj.length) {
                throw new Exception("数组下标越界");
            } else {
                return obj[index];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        MyList myList = new MyList();
        Object[] objects = myList.obj;
        for (int i = 0; i < objects.length; i++) {
            objects[i] = i + 1;
            myList.size++;
        }
        myList.add(88);
        System.out.println(myList.getObject(10));
    }
}
