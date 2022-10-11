import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split(" ");

        for (int i = arr.length - 1; i >=0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
