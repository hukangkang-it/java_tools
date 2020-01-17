package com.hkk.toolsweb.array;
/*
如何获取数组的长度，格式如下：
数组名称.length
这将会得到一个int数字，代表数组的长度

数组一旦创建，程序运行期间，长度不可改变
 */
public class Demo07ArrayLength {
    public static void main(String[] args) {
        int[] arrayA =  new int[3];

        int[] arrayB = {1,2,1,2,1,2,1,2,1,2,1,2,1};
        int len = arrayB.length;
        System.out.println("arrayB数组的长度是：" + len);
    }
}
