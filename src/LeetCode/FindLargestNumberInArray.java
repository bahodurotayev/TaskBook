package LeetCode;

public class FindLargestNumberInArray {
    static int findLargestNumberInArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[]arr= {2, 3, 5, 1, 5, 7, 10};
        int largestNumberInArray = findLargestNumberInArray(arr);
        System.out.println("largestNumberInArray = " + largestNumberInArray);
    }
}
