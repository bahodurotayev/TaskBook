public class Task10 {
    /*Task 10
        Create a method which will take a String as a parameter and return type is char.
        This method should return a character which is mostly consecutively repeated.

        Example:
        String = "aaaabbacccccdddccaaaddddaac"
        Output should be c.

        Explanation: c continuously / without breaking is repeated 5 times. more then a, b, or d.

        note: This is a most recent interview question!!!*/

    static char longestChar(String str){

        char newChar = ' ';

         int maxCount = 0;

        char [] charArr = str.toCharArray();

        for (int i = 0; i <charArr.length ; i++) {
            int count = 1;
            for (int j = i+1; j <charArr.length ; j++) {
                if (charArr[i] == charArr[j]){
                    count++;
                    if(maxCount < count){
                        newChar = charArr[i];
                        maxCount = count;
                    }
                } else if (charArr[i] != charArr[j]) {
                    i = j-1;
                    break;
                }
            }
        }

        return newChar;
    }

    public static void main(String[] args) {
        String str = "aaaabbbbbbbbbacccccdddccaaaddddaac";
        char c = longestChar(str);
        System.out.println(c);
    }
}
