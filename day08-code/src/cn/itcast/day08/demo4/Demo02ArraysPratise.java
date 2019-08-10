package cn.itcast.day08.demo4;

import java.util.Arrays;

/**
 * @author xuzhipu
 * @create 2019-04-30 0:52
 *
 * 使用Arrays的API 将字符串 生序排列,并且倒叙打印
 */
public class Demo02ArraysPratise {
    public static void main(String[] args) {
        String str = "fdjsklfdjslfdjsf";
        char[] array = str.toCharArray(); //转换成字符数组
        Arrays.sort(array); // 讲数组正序排列

        for (int i = array.length-1; i >0; i--) {

            System.out.print(array[i]);
        }

    }
}
