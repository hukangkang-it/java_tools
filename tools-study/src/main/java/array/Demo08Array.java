package array;
/*
遍历数组：就是对数组当中的每一个元素进行逐一、挨个儿处理。默认的处理方式就是打印输出

 */
public class Demo08Array {

    public static void main(String[] args) {
        int[] arrayA = {15, 25, 36, 44, 56};

        for (int i = 0; i < 5; i++) {
            System.out.println(arrayA[i]);
        }

        //使用循环，次数其实就是数组的长度
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
    }
}
