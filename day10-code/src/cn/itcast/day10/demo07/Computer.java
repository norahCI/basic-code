package cn.itcast.day10.demo07;

/**
 * @author xuzhipu
 * @create 2019-05-08 14:01
 */
public class Computer {
    public  void  powerOn(){
        System.out.println("开机");
    }
    public  void  powerOff(){
        System.out.println("关机");
    }
    public void useDevice(Usb usb){
        usb.open();
        if ( usb instanceof Keybord){
            Keybord keybord =(Keybord)usb;  //向下转型,调用子类特有的方法
            keybord.type();

        }else if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
        usb.close();
    }
}
