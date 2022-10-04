import java.util.Arrays;

public class Task9 {


    /* Rotate array in Java
             Rotate an array of n elements to the right by k steps. For example, with
             n = 7 and k = 3, the array [1,2,3,4,7,5,6] is rotated to [7,6,5,1,2,3,4].*/

    static int[] rotateArray (int[] arr, int k){
        for (int j = 0; j < k; j++) {

            for (int i = arr.length - 1; i > j; i--) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
        return arr;
    }

    static int[] rotateArray2 (int[] arr, int k){

        int[] newArr = new int[arr.length];
        for (int i = 0; i < k ; i++) {
          newArr[i] = arr[arr.length - i-1];
        }
        int j = 0;
        for (int i = k; i <arr.length; i++) {
            newArr[i]= arr[j];
            j++;
        }
        return newArr;
    }

    public static void main(String[] args) {

        int[]num = {1, 2, 3, 4, 5, 6, 7};
        int[] ints = rotateArray2(num, 3);
        System.out.println("ints = " + Arrays.toString(ints));


    }
}
