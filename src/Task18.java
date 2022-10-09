public class Task18 {
    public static void main(String[] args) {

        String str = "143321";
        char[] arrChar = str.toCharArray();

        boolean isPalindrome = false;

        for (int i = 0; i <arrChar.length ; i++) {
            for (int j = arrChar.length - 1 - i; j >= 0; j--) {

                if(arrChar[i] == arrChar[j]){
                        isPalindrome = true;

                }else {
                    isPalindrome = false;
                    i = arrChar.length;
                    break;
                }
                break;
            }
        }

        System.out.println(isPalindrome);

    }
}
