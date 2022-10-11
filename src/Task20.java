import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arrStr = scan.nextLine().split(" ");

        int total = 0;
        for (int i = 0; i < arrStr.length; i++) {
            total += arrStr[i].length();

        }
        System.out.println(total);
    }
}
