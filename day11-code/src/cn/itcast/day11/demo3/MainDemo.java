package cn.itcast.day11.demo3;

/**
 * @author xuzhipu
 * @create 2019-05-08 15:58
 * 调用内部类
 */
public class MainDemo {

    public static void main(String[] args) {
        //1.通过new外().new内()
     /*   Body.heart heart = new Body().new heart();
        heart.jump();*/
        //2.通过外部类的方法调用
 /*       new Body().nei();*/

        //3.调用局部内部类
        Outer outer = new Outer();
        outer.method();
    }


}
