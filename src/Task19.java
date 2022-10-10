public class Task19 {
    public static void main(String[] args) {

        int num = 11211;
        String str = String.valueOf(num);
        Boolean palindrome = isPalindrome(str);
        System.out.println("palindrome = " + palindrome);

    }
    static Boolean isPalindrome(int x) {
        if(x < 0 || x % 10 == 0 && x != 0){
            return false;
        }
        int number = 0;
        while (x > number){
            number = number * 10 + x % 10;
            x = x / 10;
        }
        return number == x || number / 10 == x;
    }
    static Boolean isPalindrome(String str){

        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length() - 1 - i; j >= 0 ; j--) {
                if(str.charAt(i) == str.charAt(j)){
                    break;
                }else{
                    return false;
                }

            }
        }
        return true;
    }


}
