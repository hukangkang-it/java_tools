package array;

public class Demo09ArrayMax {

    public static void main(String[] args) {
        int[] arrayA = {12, 20, 30, 15, 200};

        int max = arrayA[0];//比武擂台
        for (int i = 1; i < arrayA.length; i++) {
            //如果当前元素，比max更大，则换人
            if(arrayA[1] > max);
            max = arrayA[i];
        }
        System.out.println(max);
    }
}
