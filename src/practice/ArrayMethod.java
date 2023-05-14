package practice;

import java.util.Arrays;

public class ArrayMethod {
    int[] array = {1, 3, 2, 6, 5, 8, 9, 0, 4, 7};
    static int[] ascendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
                i = -1;
            }
        }
        return array;
    }

    static int[] descendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                int temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
                i = -1;
            }
        }
        return array;
    }

    static int highestNumber(int[] array) {
        int highestNum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > highestNum) {
                highestNum = array[i];
            }
        }
        return highestNum;
    }

    static int lowestNumber(int[] array) {
        int lowestNum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < lowestNum) {
                lowestNum = array[i];
            }
        }
        return lowestNum;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 6, 5, 8, 9, 0, 4, 7};

        int[] ascArray = ascendingOrder(array);
        System.out.println("Ascending Order : " + Arrays.toString(ascArray));

        int[] dscArray = descendingOrder(array);
        System.out.println("DescendingOrder : " + Arrays.toString(dscArray));

        int highestNumber = highestNumber(array);
        System.out.println("Highest Number in Array : " + highestNumber);

        int lowestNumber = lowestNumber(array);
        System.out.println("Lowest Number in Array : " + lowestNumber);
    }

}
