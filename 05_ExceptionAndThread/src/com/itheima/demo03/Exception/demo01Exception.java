package com.itheima.demo03.Exception;

import java.util.ArrayList;

/**
 * @author xuzhipu
 * @create 2019-05-21 19:14
 * 异常处理的三种方式
 * 1.多次捕获,多次处理
 * 2.一次捕获,多次处理
 *      注意事项:  先捕获小的异常,然后捕获大的异常
 * 3.一次捕获,一次处理
 *
 */
public class demo01Exception {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

       // first(arr,integers);//多次捕获,多次处理
        //多次捕获,多次处理
        //two(arr,integers); //一次捕获,多次处理
        three(arr,integers);



    }

    private static void first(int[] arr,ArrayList<Integer> integers) {
        try {

            int i = arr[3];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界");
            e.printStackTrace();
        }
        try {
            Integer integer = integers.get(3);

        }catch (IndexOutOfBoundsException e){
            System.out.println("集合下标越界");
            //e.printStackTrace();
        }
    }

    private static void two(int[] arr, ArrayList<Integer> integers) {
        try {
            int i = arr[3];
            Integer integer = integers.get(3);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("集合下标越界");
            e.printStackTrace();
        }
    }

    private static void three(int[] arr, ArrayList<Integer> integers) {
        try {
            int i = arr[3];
            Integer integer = integers.get(3);
            System.out.println("i#int:"+i+integer);
        }catch (Exception e){
            System.out.println("反正是下标越界");
           // e.printStackTrace();
        }
    }
}