import java.util.Arrays;

public class Task13 {

    static int[] ascendingOrder(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = 0;
            }
        }
       return arr;
    }
    static int[] ascendingOrder2(int [] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 5, 7, 10, 11, 45};
        ascendingOrder2(arr);
        System.out.println(Arrays.toString(arr));

    }
}
