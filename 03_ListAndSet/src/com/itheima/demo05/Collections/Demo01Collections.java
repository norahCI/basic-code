package com.itheima.demo05.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author xuzhipu
 * @create 2019-05-14 9:57
     *1.   static <T> boolean
     *      addAll(Collection<? super T> c, T... elements)
     *          将所有指定元素添加到指定 collection 中。
 *  2.static void shuffle(List<?> list)
 *           使用默认随机源对指定列表进行置换。
 *
 *  3.static <T extends Comparable<? super T>>
 * void  sort(List<T> list)
 *           根据元素的自然顺序 对指定列表按升序进行排序。
 *    注意事项:
 *          传递的自定义对象的排序,需要实现Comparable接口.重写接口中的 compaerTo()定义排序的规则
 *          Comparable接口的排序规则
 *          自己(this)-参数  升序  反之降序
 *
 */
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        Collections.addAll(list,"b","c","d","e");  //添加所有
        Collections.shuffle(list);  //打乱顺序
        System.out.println("打乱后"+list);
        Collections.sort(list); //排序
        System.out.println("排序后"+list);


    }
}
