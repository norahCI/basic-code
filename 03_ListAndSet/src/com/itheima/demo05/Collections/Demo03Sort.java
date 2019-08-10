package com.itheima.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author xuzhipu
 * @create 2019-05-14 10:50
 *
 * static <T> void
 *  sort(List<T> list, Comparator<? super T> c)
 *           根据指定比较器产生的顺序对指定列表进行排序。
 *    Comparator和Comparable的区别
 *         Comparable:自己(this)和别人(参数)比较,自己需要实现Comparable接口,重写比较的规则compareTo方法
 *         Comparator:相当于找一个第三方的裁判,比较两个
 *
 *     Comparator的排序规则:
 *         o1-o2:升序
 *
 */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("b张三",18));
        list.add(new Student("张三",10));
        list.add(new Student("张三",58));
        list.add(new Student("a张三",18));
        //排序
        Collections.sort(list, new Comparator<Student>() {  //匿名内部类,重写compare方法
            @Override
            public int compare(Student o1, Student o2) {
                Integer a = 10;

              int   result = o1.getAge()-o2.getAge();  //按照年龄排序
              if(result==0){  //如果年龄相同就按照 名字的首字母排序
                  result= o1.getName().charAt(0)-o2.getName().charAt(0);
              }
              return result;
            }
        });
        System.out.println("排序"+list);


    }
}
