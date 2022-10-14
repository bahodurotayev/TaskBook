public class Task32 {
    static String reverseString(String str){
        String newStr = "";
        for (int i = str.length() - 1; i >=0 ; i--) {
            newStr +=str.charAt(i);
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "Hello";
        String s = reverseString(str);
        System.out.println(s);
    }
}
