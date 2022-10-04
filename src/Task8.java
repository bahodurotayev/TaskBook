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



        return strArr;
    }

    public static void main(String[] args) {


    }
}
