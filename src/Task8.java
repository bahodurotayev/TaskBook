import java.util.Arrays;

public class Task8 {
    /*Task 4
        Given an array of Strings.
        Create a method, that will sort this array of Strings in ascending order.*/

    static String ascendingString(String str){

        char[] charToArr = str.toCharArray();
        char temp = ' ';
        for (int i = 0; i <charToArr.length ; i++) {
            for (int j = i + 1; j < charToArr.length; j++) {
                if(charToArr[i] > charToArr[j]){
                    temp = charToArr[i];
                    charToArr[i] = charToArr[j];
                    charToArr[j] = temp;
                }
            }

        }
        str = String.copyValueOf(charToArr);

        return str;
    }

    static String[] sortStringArray (String[] strArr){

        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if(strArr[i].charAt(0) > strArr[j].charAt(0)){
                    String temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
            strArr[i] = ascendingString(strArr[i]);
        }
        return strArr;
    }

    public static void main(String[] args) {

        String[] str = {"Ibrahim", "bayram", "zubeyir", "Mehmet", "dave", "Shanon", "elif"};
        sortStringArray(str);
        System.out.println(Arrays.toString(str));
    }
}
