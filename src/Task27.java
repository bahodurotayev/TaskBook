import java.util.ArrayList;
import java.util.List;

public class Task27 {
    static String fizzBuzz(int n){
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }
        else if(n % 3 == 0){
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        }
        return "-1";
    }

    static List<String> fizBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> strings = fizBuzz(15);
        System.out.println(strings);

    }
}
