package array;
/*
数组的索引编号从0开始，一直到数组长度-1为止
如果访问数组元素的时候，索引编号不存在，那么将会发生
数组索引越界异常
ArrayIndexofBoundsException

原因：索引编号写错了
解决：修改为存在的正确索引编号
 */
public class Demo05ArrayIndex {
    public static void main(String[] args) {
        int[] arrayA = {15, 25, 35};

        //错误写法
        //并不存在3号元素，所以发生异常
        System.out.println(arrayA[3]);
    }
}
