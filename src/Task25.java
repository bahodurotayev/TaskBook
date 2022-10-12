import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Task25 {

    static int singleNumber(int[]arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])){
                set.remove(arr[i]);
            }else {
                set.add(arr[i]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        return list.get(0);
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1};
        int i = singleNumber(arr);
        System.out.println(i);

    }
}
