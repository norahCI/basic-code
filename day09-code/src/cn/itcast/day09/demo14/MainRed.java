package cn.itcast.day09.demo14;

import java.util.ArrayList;

/**
 * @author xuzhipu
 * @create 2019-05-07 18:27
 */
public class MainRed {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 30);
        ArrayList<Double> red = manager.sendRed(100, 3);

        Member zhangsan = new Member("张三", 100);
        Member zhangsi = new Member("张四", 100);
        Member zhangwu = new Member("张五", 100);
        zhangsan.openRed(red);
        zhangsi.openRed(red);
        zhangwu.openRed(red);
        manager.show();
        zhangsan.show();
        zhangsi.show();
        zhangwu.show();


    }
}
