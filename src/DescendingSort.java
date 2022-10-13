import java.util.Arrays;

public class DescendingSort {
    static int[] descendingSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < arr[i + 1]){
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
        int[] ints = descendingSort(arr);
        System.out.println(Arrays.toString(ints));

    }
}
