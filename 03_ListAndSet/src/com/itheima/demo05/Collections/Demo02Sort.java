package com.itheima.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author xuzhipu
 * @create 2019-05-14 10:17
    3.static <T extends Comparable<? super T>>
 *      void  sort(List<T> list)
 *           根据元素的自然顺序 对指定列表按升序进行排序。
 *    注意事项:
 *          传递的自定义对象的排序,需要实现Comparable接口.重写接口中的 compaerTo()定义排序的规则
 *          Comparable接口的排序规则
 *          自己(this)-参数  升序  反之降序
 *
 *
 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Persion> list = new ArrayList<>();
        list.add(new Persion("小米",5000));
        list.add(new Persion("小米",2000));
        list.add(new Persion("小米",8000));
        System.out.println("排序前"+list);
        Collections.sort(list);
        System.out.println("排序后"+list);
    }
}
