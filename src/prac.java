import java.util.*;
import java.util.stream.IntStream;

public class prac {
    public static void main(String[] args) {

    /* HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "abc");
        map.put(2, "qwe");
        map.put(3, "rty");
        map.put(4, "tyu");
        int [] arr = {3, 5};
        String str = "";
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            for (int i = 0; i <arr.length ; i++) {
                if(entry.getKey() == arr[i]){
                    str += entry.getValue();
                }
            }
        }

        System.out.println(str);*/

       /* List<Integer> list = convertToArray(123);
        System.out.println(list);


        int num = 1234567;

        int[] digits = Integer.toString(num).chars().map(c -> c-'0').toArray();
        System.out.println(Arrays.toString(digits));

        String str = Integer.toString(num);
        String [] strArr = str.split("");
        System.out.println(Arrays.toString(strArr));*/

//        int num = 123;
//        IntStream IntStream = Integer.toString(num).chars().map(c-> c-'0');
//        System.out.println((Arrays.toString(IntStream.toArray())));

    }
    static List<Integer> convertToArray(int num){
        ArrayList<Integer> list = new ArrayList<>();
        do{
            list.add(num % 10);
            num = num / 10;

        }while (num > 0);

        return list;

    }
}
