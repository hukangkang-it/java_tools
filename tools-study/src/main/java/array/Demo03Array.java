package array;
/*
直接打印数组名称：得到的是数组对应的内存地址哈希值
二进制：01
十进制：0123456789
十六进制：0123456789abcdef

访问数组元素的格式：数组名称{索引值}
索引值：就是一个int数字，代表数组当中元素的编号
【注意】索引值从0开始，一直到数组长度-1为止
 */
public class Demo03Array {

    public static void main(String[] args) {
        //静态初始化的省略格式

        int[] arrayA = {10, 20, 30};
        System.out.println(arrayA);

        //直接打印数组中的元素
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);

        //也可以将数组当中的某一个单个元素，赋值给变量
        int num = arrayA[1];
        System.out.println(num);
    }
}