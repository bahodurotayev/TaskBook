import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task20 {
    public static void main(String[] args) {
        String str = "Java is Fun 2005";
        String[] arrStr = str.split(" ");

        int total = 0;
        for (int i = 0; i < arrStr.length; i++) {
            total += arrStr[i].length();

        }
        System.out.println(total);
    }
}
