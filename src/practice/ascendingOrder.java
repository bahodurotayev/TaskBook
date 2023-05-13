package practice;

import java.util.Arrays;

public class ascendingOrder {
    static void sortInAscendingOrder(int[] array) {
    }

    public static void main(String[] args) {
        int[] array = {120, 43, 56, 123, 456, 23, 1, 5, 0};
        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[i + 1];
            if (array[i] > temp) {
                array[i + 1] = array[i];
                array[i] = temp;
                i = -1;
            }

        }
        System.out.println(Arrays.toString(array));
    }
}
