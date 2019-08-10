package cn.itcast.day10.demo07;

/**
 * @author xuzhipu
 * @create 2019-05-08 14:10
 * 重点   接口的基本使用  , 方法转型   调用子类特有的方法需要向下转型
 */
public class MainDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Usb mouse = new Mouse();

        computer.useDevice(mouse);

    }
}
