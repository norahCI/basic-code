package cn.itcast.day06.demo02;

/**
 * @author xuzhipu
 * @create 2019-04-27 15:10
 */
public class Phone {
    //成员变量
    String brank;
    String color;
    double price;
    public void sendMes(){
        System.out.println("发短信");
    }
    public void tel(String name){
        System.out.println("打电话给:"+name);
    }


}
