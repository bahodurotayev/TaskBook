package LeetCode;

import java.util.HashSet;

public class ContainsDuplicate {
    static Boolean containsDuplicate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i] == arr[j] && i != j){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        Boolean aBoolean = containsDuplicate2(arr);
        System.out.println("aBoolean = " + aBoolean);
    }
    static boolean containsDuplicate2(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])){
                return true;
            }else {
                set.add(arr[i]);
            }
        }
    return false;
    }
}
