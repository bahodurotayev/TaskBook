import java.util.Arrays;

public class Task12 {

    static int[] sortedArr (int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i+1] = temp;
                i = 0;
            }

        }
        return arr;
    }
    static int[] sortedArr2 (int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length ; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    }
                }
            }
        return arr;
    }

    static int[] sumOfTwo(int[]arr, int target){

        int[] arrNew= new int[2];
        int a =0;
        int b = arr.length-1;
        while (a <= b){
            int sum = arr[a] + arr[b];
            if(sum > target){
                b -= 1;
            } else if (sum < target) {
                a += 1;
            }
            else {
               arrNew[0] = a + 1;
               arrNew[1] = b + 1;
               break;
            }

        }
        return  arrNew;
    }

    static int[] sumOfTwo2(int[]arr, int target){
       int[] newArr = new int[2];
                // 2 7
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    newArr[0] = i;
                    newArr[1] = j;
                }
                else {
                    break;
                }
            }
        }

       return newArr;
    }

    public static void main(String[] args) {
        int [] arr = {2, 3, 7, 13, 7, 23, 3};

        /*int [] arr2 = {2, 11, 7, 15, 5, 6, 8, 3, 0, 9};
        int[] ints = sortedArr2(arr2);
        System.out.println(Arrays.toString(ints));*/

        int[] ints = sumOfTwo(arr, 14);
        System.out.println(Arrays.toString(ints));
    }
}
