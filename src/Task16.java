import java.util.Arrays;
import java.util.Random;

public class Task16 {
    static int[] randomNum(int length){
        length = 10;
        Random rnd= new Random();

        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(0, 50);
        }
        return arr;
    }

    static int[] reverse(int[] arr){

        for (int i = 0; i <arr.length/2; i++) {
            for (int j = arr.length- 1 - i; j >= 0 ; j--) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                break;
            }
        }
        return arr;
    }
    static int[] reverse2(int[] arr) {

        int[] newArr = new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            newArr[arr.length-1-i] = arr[i];
        }
        return newArr;
    }

    static int[] ascendingOrder(int [] arr){

        for (int i = 0; i <arr.length -1; i++) {
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
            }
        }
        return arr;
    }
    static int[] ascendingOrder2(int [] arr){

        for (int i = 0; i <arr.length; i++) {
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
    static int[] descendingOrder(int[] arr){

        for (int i = 0; i <arr.length - 1; i++) {
            if(arr[i] < arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
            }
        }
    return arr;
    }
    static int[] descendingOrder2(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
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
        int [] arr= randomNum(10);
       System.out.println(Arrays.toString(arr));

        int[] reverse = reverse2(arr);
        System.out.println(Arrays.toString(reverse));

        ascendingOrder2(reverse);
        System.out.println(Arrays.toString(reverse));

        int[] ints = descendingOrder(reverse);
        descendingOrder(arr);
        System.out.println(Arrays.toString(arr));

    }
}
