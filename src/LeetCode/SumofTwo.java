package LeetCode;

import java.util.Arrays;

public class SumofTwo {
    public static int[] sumOfTwo(int[] arr, int target){
        int[]newArr = new int[2];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] + arr[i + 1] == target){
                newArr[0] = i;
                newArr[1] = i + 1;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int[] ints = sumOfTwo2(arr, 17); 
    }
    public static int[] sumOfTwo2(int[] arr, int target){
        int[] newArr = new int[2];
       int left = 0;
       int right = arr.length - 1;
       while (left < right){
           int sum = arr[left] + arr[right];
           if(sum > target){
                right--;
           }else if(sum < target){
               left++;
           }else {
               newArr[0] = left;
               newArr[1] = right;
               break;
           }
       }
       return newArr;
    }
}
