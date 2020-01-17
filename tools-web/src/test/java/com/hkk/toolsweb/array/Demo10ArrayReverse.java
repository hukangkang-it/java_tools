package com.hkk.toolsweb.array;
/*
数组元素反转；
本来的数组：[1, 2, 3, 4]
反转数组：[4, 3, 2, 1,]
1.数组元素反转，其实就是对称位置的元素交换
2.通常遍历数组用的是一个索引：
int i = 0 ；
现在表示对称位置需要两个索引；
int min = 0；
int max = array.length- 1；
3.如何交换两个变量的值？
int a = 10；
int b = 20；
如果是两个杯子，都是满的，如何交换？借助第三个空杯子

 */
public class Demo10ArrayReverse {
    public static void main(String[] args) {
        int[] arrayA= {10, 20, 30, 46, 96};
        //
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(i);

        }

//        for (int min = 0, max = arrayA.length- 1; min < max; min++, max--);
//        int temp = arrayA[min];
//        arrayA[min] = arrayA[max];
//        arrayA[max] = temp;

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(i);
        }
    }
}
