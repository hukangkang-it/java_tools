package array;
/*
动态初始化（指定长度）：在创建数组的时候，直接指定数组中的数据元素个数
静态初始化（指定内容）：在创建数组的时候，不直接指定数据个数多少，而且直接将具体的数据内容进行指定

静态初始化基本格式：
数据类型[] 数组名称 = new 数据类型[]{元素1， 元素2， ...}

静态初始化省略格式：
数据类型[] 数组名称 = {元素1， 元素2， ....}

注意事项：
1.虽然静态初始化没有直接告诉长度，但是根据大括号里面的元素具体内容，也可以自动推算出来长度
2.静态初始化标准格式可以拆分成两个步骤
3.动态初始化也可以拆分成两个步骤

使用建议：
如果不确定数组中的具体内容，用动态初始化；否则，已经确定了具体内用，用静态初始化
 */


public class Demo02Array {

    public static void main(String[] args) {
        //创建一个数组，里面装的全部是int数字，具体为：5、15、25
        int[] arrayA = new int[]{5, 15, 25};

        //创建一个数组，用来装字符串："Hello"、"World"、"Java"
        String[] arrayB = new String[]{"Hello", "World", "Java"};
    }

    public static void mainA(String[] args) {
        //省略格式的静态初始化
        int[] arrayA = {10, 20, 30};
        //静态初始化的标准格式，可以拆分成两个步骤
        int[] arrayB;
        arrayB = new int[]{10, 20, 30};

        //动态初始化也可以拆分成两个步骤
        int[] arrayC ;
        arrayC = new int[5];

    }
}
