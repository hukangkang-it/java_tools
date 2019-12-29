package array;
/*
所有引用类型变量，都可以赋值为一个null值。但是代表其中什么都没有

数组必须进行new初始化才能使用其中的元素
如果只是赋值一个null，没有进行new创建
那么将会发生NullPointerException
原因：忘了new
解决：不上new
 */
public class Demo06ArrayNull {

    public static void main(String[] args) {

        int[] arrayA = null;
//      arrayA = new int[3];
        System.out.println(arrayA[1]);

    }
}
