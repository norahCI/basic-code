package com.itheima.demo03.Generic;

/**
 * @author xuzhipu
 * @create 2019-05-11 15:36
 * 使用泛型传值
 */
public class Demo01Generic<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
