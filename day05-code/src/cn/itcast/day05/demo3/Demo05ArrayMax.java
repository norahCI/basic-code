package cn.itcast.day05.demo3;

/**
 * @author xuzhipu
 * @create 2019-04-27 13:36
 *
 * 数组的最大值
 */
public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] a = {1,2,3};//比如论坛
        int max =a[0]; //假如第一个最猛
        for (int i = 1; i < a.length; i++) {
            if(a[i]>a[0]){ // 如果后边的比前面的厉害,那么久替换下来
                max=a[i];
            }
        }
        System.out.println("最大值:"+max);


    }

}
