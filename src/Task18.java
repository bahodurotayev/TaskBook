public class Task18 {
    static Boolean isPalindrome4(int x){ // way 4 for integers

        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int r = 0;
        while (x > r){
            r = r * 10 + x % 10;
            x = x / 10;
        }
        return r == x || r / 10 == x;
    }
    public static void main(String[] args) {

        String str = "1211133321";
        int num = 123321;
        Boolean palindrome = isPalindrome(str);
        System.out.println(palindrome);
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
    static Boolean isPalindrome2(String str){
        String newStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            newStr +=str.charAt(i);
        }
        if(str.equals(newStr)){
            return true;
        }
     return false;
    }
    static Boolean isPalindrome3(String str){

        int start = 0;
        int end = str.length()-1;

        while (start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
