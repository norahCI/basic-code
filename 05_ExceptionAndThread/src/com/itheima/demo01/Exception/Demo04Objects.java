package com.itheima.demo01.Exception;

import java.util.Objects;

/**
 * @author xuzhipu
 * @create 2019-05-21 16:28
 *
 *  objects中的 requireNonNull  进行 非空判断
 *
 */
public class Demo04Objects {
    public static void main(String[] args) {
        method(null);
    }

    private static void method(String i) {
        Objects.requireNonNull(i,"传递的对象为空");

    }
}
