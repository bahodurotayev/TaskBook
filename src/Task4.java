import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7};


        int[] rotate = rotate1(arr, 3);
        System.out.println("Way 1 :" + Arrays.toString(rotate));

        rotate2(arr, 3);
        System.out.println("Way 2 :" + Arrays.toString(arr));

    }
    static int[] rotate1 (int[] arr, int k){

        //1 2 3 4 5 6 7
        //0 1 2 3 4 5 6
        // WAY - 1

        int[] result = new int[arr.length];

        for(int i=0; i < k; i++){
            result[i] = arr[arr.length-k+i];
        }
        int j=0;
        for(int i=k; i<arr.length; i++){
            result[i] = arr[j];
            j++;
        }
        return result;
    }

    static int[] rotate2 (int[] arr, int k){
        //1 2 3 4 5 6 7
        //0 1 2 3 4 5 6
        // WAY - 2

        for (int i = 0; i < k; i++) {
            for (int j = arr.length - 1; j > 0 ; j--) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        return arr;
    }

}
