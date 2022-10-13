public class MostRepeatedConsecutiveChar {
    /*Create a method which will take a String as a parameter and return type is char.
         This method should return a character which is mostly consecutively repeated.

         Example:
         String = "aaaabbacccccdddccaaaddddaac"
         Output should be c.

         Explanation: c continuously / without breaking is repeated 5 times. more then a, b, or d.*/
static Character mostReapedConsecutiveChar(String str){


    int maxCount = 0;
    char finalChar = ' ';
    for (int i = 0; i < str.length(); i++) {
        int count = 1;
        for (int j = i + 1; j <str.length() ; j++) {
            if(str.charAt(i) == str.charAt(j)) {
                count++;
                if (maxCount < count) {
                    maxCount = count;
                    finalChar = str.charAt(i);
                }
            }else if(str.charAt(i) != str.charAt(j)) {
                    i = j - 1;
                    break;
                }
        }
    }
    return finalChar;
    }

    public static void main(String[] args) {
        String str= "aabbeeeaaeaaddddbbbbbbeeee";
        Character character = mostReapedConsecutiveChar(str);
        System.out.println(character);

    }
}
