package LeetCode;

public class FindSmallestNumberInArray {
    static int findSmallestNumberArray(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 6, 8, 12, 0};
        int smallestNumberArray = findSmallestNumberArray(arr);
        System.out.println("smallestNumberArray = " + smallestNumberArray);
    }
}
