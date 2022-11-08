package LeetCode;

import java.util.Arrays;

public class AscendingSort {
    static int[] ascendingOrder(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
                }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 1, 3, 7, 9, 10};
        int[] ints = ascendingOrder(arr);
        System.out.println("ints = " + Arrays.toString(ints));
    }
}
