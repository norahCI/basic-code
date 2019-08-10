package cn.itcast.day11.demo8;

import cn.itcast.day11.red.OpenMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuzhipu
 * @create 2019-05-08 19:10
 */
public class Bootstrap {
    public static void main(String[] args) {
        red red = new red("微信");
        red.setOwnerName("许之璞");
        //匿名内部类
        OpenMode openMode = new OpenMode() {
            @Override
            public ArrayList<Integer> divide(int totalMoney, int totalCount) {
                int m= totalMoney/totalCount;//每份的金额
                int y = totalMoney%totalCount; //最后的余额
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 0; i < totalCount-1; i++) {
                    list.add(m);//把每份金额装进去
                }
                list.add(m+y); //最后一份把余款装进去
                return list;
            }
        };

        red.setOpenWay(openMode);


    }
}
