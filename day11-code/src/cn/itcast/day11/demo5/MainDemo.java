package cn.itcast.day11.demo5;

/**
 * @author xuzhipu
 * @create 2019-05-08 16:45
 * 匿名内部类
 */
public class MainDemo {
    public static void main(String[] args) {
        //                       创建   实现接口 { 内容 }
        MyInterface myInterface = new MyInterface() {
            @Override
            public void send() {
                System.out.println("匿名内部类在跑");
            }
        };
        myInterface.send(); //调用
    }
}
