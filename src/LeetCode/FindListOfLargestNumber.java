package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindListOfLargestNumber {

    public static void main(String[] args) {
        int[] arr = {1200, 14, 15, 546, 23, 123, 44, 666, 34};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first){
                //third = second;
                first = arr[i];
            } else if (arr[i] > second) {
                //third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
            list.add(first);
            list.add(second);
            list.add(third);

        }
        System.out.println(first + " " + second + " " +third);
    }
}
