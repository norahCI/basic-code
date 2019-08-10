package cn.itcast.day05.demo3;

/**
 * @author xuzhipu
 * @create 2019-04-27 13:49
 * 返回值为 数组
 */
public class Demo05ArrayResult {
    public static void main(String[] args) {
        int[] calc = calc(2, 3, 4);
        System.out.println("总和为:"+calc[0]);
        System.out.println("平均为:"+calc[1]);


    }

    public static int[] calc(int a, int b, int c) {
        int sum = a + b + c;
        int avg = (a + b + c) / 3;
        int[] num = {sum, avg};
        return num;


    }


}
