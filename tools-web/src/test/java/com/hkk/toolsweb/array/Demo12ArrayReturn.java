package com.hkk.toolsweb.array;
/*
数组作为方法返回值_返回地址
一个方法可以有0/1多个参数，但是只能有0或者1个返回值，不能有多个返回值
如果希望一个方法当中产生了多个结果数据进行返回，怎么办？
解决方案：使用一个数组作为返回值类型即可
任何数据类型都能作为方法的参数类型，或者返回值类型

数组作为方法的参数，传递进去的其实是数组的地址值
数组欧威方法的返回值，返回的其实也是数组的地址值
 */
public class Demo12ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10, 20, 30);
        System.out.println(result);

    }
    public static int[] calculate(int a, int b, int c){
        int sum = a + b + c;//总和
        int avg = sum / 3;//平均数
        //两个结果都希望进行返回
        //需要一个数组，也就是一个塑料兜，数组可以保存多个结果
        /*
        int[] arrayA = new int[2];
        arrayA[0] = sum;总和
        arrayA[1] = avg;平均数
         */
        int[] arrayA = {sum, avg};
        return arrayA;
    }
}
