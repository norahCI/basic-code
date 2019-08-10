package cn.itcast.day05.demo3;

import java.util.concurrent.ForkJoinPool;

/**
 * @author xuzhipu
 * @create 2019-04-27 13:49
 * 同一个数组中 元素位置切换
 */
public class Demo05ArrayReverse {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4};
        //遍历本来的样子
        printArray(array);

        System.out.println("==============");
//    翻转之后的样子
        for (int min = 0, max = array.length - 1; max > min; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        printArray(array);

    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }


}
