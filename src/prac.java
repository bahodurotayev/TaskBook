import java.util.Scanner;

public class prac {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        boolean palindrome = isPalindrome(str);
        System.out.println(palindrome);

    }
    static boolean isPalindrome(String str){

        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length()-1 - i; j >=0; j--) {
                if(str.charAt(i) != str.charAt(j)){
                    return false;
                }else {
                    break;
                }
            }
        }
        return true;
    }
}
