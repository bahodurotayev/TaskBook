import java.util.Arrays;

public class Task40 {
    public static void main(String[] args) {

        int[] arr = {5, 7, 7, 8, 8, 8, 8, 8, 8, 5, 9, 10};
        int[] ints = startEndPosition(arr, 11);
        System.out.println(Arrays.toString(ints));
    }
    static int[] startEndPosition(int[] arr, int target){
        int[] newArr = new int[2];
        newArr[0] = findStartPosition(arr, target);
        newArr[1] = findEndPosition(arr, target);

        return newArr;
    }
    static int findStartPosition(int[] arr, int target){
        int start = -1;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                start = mid;
                right = mid-1;
            }else if (target > arr[mid]){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return start;
    }
    static int findEndPosition(int[] arr, int target){
        int end = -1;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if (arr[mid] == target){
                end = mid;
                left = mid + 1;
            } else if (target > arr[mid]) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return end;
    }
}
