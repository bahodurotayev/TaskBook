import java.util.Arrays;

public class Task37 {
    static int findKthLargestElement(int[] arr, int k){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i+1] = temp;
                i = -1;
            }
        }

        return arr[arr.length - k];
    }

    public static void main(String[] args) {
        int[]arr = {3, 2, 1, 5, 6, 4};
        int kthLargestElement = findKthLargestElement(arr, 2);
        System.out.println("kthLargestElement = " + kthLargestElement);

    }
}
