package com.itheima.demo01.Exception;

/**
 * @author xuzhipu
 * @create 2019-05-21 15:52
 * 返回数组下标的位置
 */
public class Demo02Exception {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        try {
            int index = getIndex(arr, 3);

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("下标月结");
        }
        System.out.println("...");
    }

    private static int getIndex(int[]arr,Integer a) {
        int i = arr[a];
        return i;
    }


}
