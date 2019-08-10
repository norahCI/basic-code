package com.itheima.demo01.Exception;

import com.sun.media.sound.SoftTuning;

/**
 * @author xuzhipu
 * @create 2019-05-21 16:11
 * Throw
 * 使用throw关键字可以在指定的方法中,抛出指定的异常.
 *  使用方法:
 *      1. throw new xxxexception("异常产生的原因")
 *  注意事项:
 *      1.必须在方法内部
 *      2.throw 关键字new的对象必须是 exception或者其子类对象
 *      3.throw关键字抛出指定的对象,我们就必须要处理这个异常对象.
 *          runtimeException或者其子类对象,可以不用处理,交给JVM虚拟机处理.
 *  作用:调用参数时进行合法性校验
 *
 *
 *
 */
public class Demo03Throw {
    public static void main(String[] args) {
        int[]arr = {1,2,3};
        int index = getIndex(arr, 3);
        System.out.println("数字是"+index);
        System.out.println("程序接着走");
    }

    private static int getIndex(int[] arr, int i) {
        if (i>arr.length-1){
            throw new IndexOutOfBoundsException("下标越界了");
        }
        int index = arr[i];
        return index;

    }
}
