package cn.itcast.day10.demo07;

/**
 * @author xuzhipu
 * @create 2019-05-08 13:57
 */
public class Keybord implements Usb{
    @Override
    public void open() {
        System.out.println("键盘打开");
    }

    @Override
    public void close() {
        System.out.println("鼠标打开");
    }
    public  void type(){
        System.out.println("输入");
    }
}
