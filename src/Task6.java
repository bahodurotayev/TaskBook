import java.util.Arrays;
import java.util.HashMap;

public class Task6 {
   /* Create a method which will take a String as a parameter and return type is char.
    This method should return a character which is mostly repeated.

            Example:
    String = "aaaabbacccccdddccaaaddddaac"
    Output should be c.
*/

   static Character longestChar (String s) {

       char temp = ' ';
       char maxChar = ' ';
       int count = 0;
       int preCount = 0;

       for (int i = 0; i < s.length(); i++) {
           temp = s.charAt(i);
           count = 1;
           for (int j = i+1 ; j <s.length(); j++) {
               if(temp == s.charAt(j)){
                   count++;
               }
           }
           if(preCount < count){
               maxChar = temp;
               preCount = count;
           }
       }
       return maxChar;
   }
    public static void main(String[] args) {

        String str = "aaaebbaaeaacccc";
        Character integer = longestChar(str);
        System.out.println(integer);

    }
}
