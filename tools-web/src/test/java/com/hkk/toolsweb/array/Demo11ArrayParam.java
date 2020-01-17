package com.hkk.toolsweb.array;
/*
数组可以作为方法的参数。
当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址值
 */
public class Demo11ArrayParam {

    public static void main(String[] args) {
        int[] arrayA = {10, 12, 16, 11};

        System.out.println(arrayA);//地址值

        printArray(arrayA);//传递进去的就是arrayA当中保存的地址值
        System.out.println("=======AA");
        printArray(arrayA);
        System.out.println("=======BB");
        printArray(arrayA);

    }

    public static void printArray(int[] arrayA){
        System.out.println("方法收到的参数");
        System.out.println(arrayA);
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
    }
}
