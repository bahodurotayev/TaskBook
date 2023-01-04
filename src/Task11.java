import java.util.Arrays;
import java.util.HashSet;

public class Task11 {

    /*Given an integer array nums, return true if any value appears at least twice in the array,
     and return false if every element is distinct*/

    static Boolean repeated (int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    static Boolean repeated2 (int[] arr){

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(hashSet.contains(arr[i])){
                return true;
            }
            hashSet.add(arr[i]);
        }
        return false;
    }

    static Boolean repeated3 (int[] arr){

       Arrays.sort(arr);
        for (int i = 0; i <arr.length-1; i++) {
            if(arr[i] == arr[i + 1]) {
                return true;
            }
        }
     return false;
    }

    public static void main(String[] args) {
        int[]arr = {7, 2, 5, 9, 1, 8};
        Boolean repeated = repeated(arr);
        System.out.println(repeated);
    }
}
