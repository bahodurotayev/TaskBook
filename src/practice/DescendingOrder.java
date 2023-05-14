package practice;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        int[] array = {120, 43, 56, 123, 456, 23, 1, 5, 0};
        System.out.println(Arrays.toString(descendingOrder(array)));
    }
    static int[] descendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] < array[i + 1]){
                int temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
                i = -1;
            }
        }
        return array;
    }
}
