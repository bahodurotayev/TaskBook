public class Task17 {
    public static void main(String[] args) {
        String str = "Java is Fun";
        String[] arr = str.split(" ");

        for (int i = args.length - 1; i >=0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
