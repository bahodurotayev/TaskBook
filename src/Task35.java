import java.util.Arrays;

public class Task35 {
    public static void main(String[] args) {
        int[]arr = {0, 1, 0, 3, 12};
        int[] ints = moveZeroes(arr);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));

    }
    static int[] moveZeroes(int[] arr){
        // 1 0 3 0 12
        //0 1
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                arr[index++] = arr[i];

            }
        }
        for (int i = index; i <arr.length ; i++) {
            arr[i] = 0;
        }
        return arr;
    }
}
