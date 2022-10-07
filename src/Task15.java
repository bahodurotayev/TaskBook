import java.util.Arrays;

public class Task15 {
    static int[] reverse(int[] arr){
        int[] reverse = new int[arr.length];
        for (int i = arr.length - 1; i >= 0 ; i--) {
            reverse [(arr.length-1) - i] = arr[i];
        }
        return reverse;
    }

    static int[] reverse2(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            for (int j = arr.length-1 -i; j >= 0 ; j--) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] reverse = reverse2(arr);
        System.out.println(Arrays.toString(reverse));
    }
}
