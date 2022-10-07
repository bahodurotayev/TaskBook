import java.util.Arrays;

public class Task14 {

    // Sorting array using Loop in descending order
    static int[] descendingOrder(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = 0;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 2, 9, 34, 12, 45, 76};
        descendingOrder(arr);
        System.out.println(Arrays.toString(arr));
    }
}
